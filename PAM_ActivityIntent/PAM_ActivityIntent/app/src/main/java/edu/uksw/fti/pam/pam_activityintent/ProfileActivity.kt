package edu.uksw.fti.pam.pam_activityintent

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import com.google.firebase.firestore.FirebaseFirestore
import edu.uksw.fti.pam.pam_activityintent.models.UserModel
import edu.uksw.fti.pam.pam_activityintent.ui.screns.ProfileScreen
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

class ProfileActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_ActivityIntentTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val bundle = intent.extras!!
                    val namadepan = bundle.getString("namadepan", "")
                    val namabelakang = bundle.getString("namabelakang", "")
                    val email = bundle.getString("email", "")


                    var userList = SnapshotStateList<UserModel?>()

                    var db: FirebaseFirestore = FirebaseFirestore.getInstance()

                    db.collection("users").get()
                        .addOnSuccessListener { queryDocumentSnapshots ->
                            if (!queryDocumentSnapshots.isEmpty) {
                                val list = queryDocumentSnapshots.documents
                                for (d in list) {
                                    val c: UserModel? = d.toObject(UserModel::class.java)
                                    userList.add(c)

                                }
                            } else {
                                Toast.makeText(
                                    this@ProfileActivity,
                                    "No data found in Database",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                        .addOnFailureListener {
                            Toast.makeText(
                                this@ProfileActivity,
                                "Fail to get the data.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    ProfileScreen( userList, namadepan, namabelakang, email)
                }
            }
        }
    }
}