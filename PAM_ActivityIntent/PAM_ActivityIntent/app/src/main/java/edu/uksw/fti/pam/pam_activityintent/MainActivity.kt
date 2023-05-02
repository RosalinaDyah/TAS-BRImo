package edu.uksw.fti.pam.pam_activityintent

//import android.content.Intent
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.ui.Modifier
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.ktx.auth
//import com.google.firebase.firestore.CollectionReference
//import com.google.firebase.firestore.FirebaseFirestore
//import com.google.firebase.ktx.Firebase
//import edu.uksw.fti.pam.pam_activityintent.models.TodosViewModel
//import edu.uksw.fti.pam.pam_activityintent.models.UserModel
//import edu.uksw.fti.pam.pam_activityintent.ui.screns.LoginForm
//import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
//
//class MainActivity : ComponentActivity() {
//    private lateinit var auth: FirebaseAuth
//    override fun onCreate(savedInstanceState: Bundle?) {
////        val vm = TodosViewModel()
//        super.onCreate(savedInstanceState)
//        auth = Firebase.auth
//        setContent {
//            PAM_ActivityIntentTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    LoginForm(onSignInAction = ::doAuth)
//                }
//            }
//        }
//    }
//    private fun getUserData(
//        uid: String,
//        onSuccess: (userModel: UserModel?) -> Unit,
//        onFailure: (exception: Exception) -> Unit,
//    ) {
//        // on below line creating an instance of firebase firestore.
//        val db: FirebaseFirestore = FirebaseFirestore.getInstance()
//        //creating a collection reference for our Firebase Firestore database.
//        val dbCourses: CollectionReference = db.collection("users")
//
//        dbCourses.document(uid).get()
//            .addOnSuccessListener {
//                if (it.exists()) {
//                    onSuccess(it.toObject(UserModel::class.java))
//                } else {
//                    onSuccess(null)
//                }
//            }.addOnFailureListener(onFailure)
//    }
//
//    private fun doAuth(username: String, password: String){
//        auth.signInWithEmailAndPassword(username, password)
//            .addOnSuccessListener { result ->
//                if (result.user!=null) {
//                    getUserData(
//                        result.user!!.uid,
//                        {
//                            if (it!=null) {
//                                startActivity(
//                                    Intent(this, HomeActivity::class.java)
//                                        .putExtra("namadepan", it.namadepan)
//                                        .putExtra("namabelakang", it.namabelakang)
//                                        .putExtra("email", it.email)
//                                )
//                                Toast.makeText(
//                                    applicationContext, "Successfully Logged In", Toast.LENGTH_SHORT).show()
//                                finish()
//                            }
//                        },
//                        {
//                            Toast.makeText(
//                                applicationContext, "Login Failed. Wrong Username or Password", Toast.LENGTH_SHORT).show()
//                        }
//                    )
//                }
//                else
//                {
//                    Toast.makeText(
//                        applicationContext, "Login Failed. Wrong Username or Password", Toast.LENGTH_SHORT).show()
//                }
//            }
//    }
//}



import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import edu.uksw.fti.pam.pam_activityintent.ui.screns.BottomNavigationMainScreenView
import edu.uksw.fti.pam.pam_activityintent.ui.screns.LoginForm
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
//        val vm = TodosViewModel()
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        setContent {
            PAM_ActivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginForm(onSignInAction = ::doAuth)
                }
            }
        }
    }

    private fun doAuth(username: String, password: String) {
        auth.signInWithEmailAndPassword(username, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(
                        Intent(this, HomeActivity()::class.java)
                    )

                    finish()
                } else {
                    Toast.makeText(
                        applicationContext, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
}