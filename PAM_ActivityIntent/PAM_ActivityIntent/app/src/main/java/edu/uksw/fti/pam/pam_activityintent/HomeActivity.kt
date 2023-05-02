package edu.uksw.fti.pam.pam_activityintent

import edu.uksw.fti.pam.pam_activityintent.models.UserProfileViewModel

//import android.annotation.SuppressLint
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.layout.ColumnScopeInstance.weight
////import androidx.compose.foundation.layout.RowScopeInstance.weight
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Icon
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.*
//import androidx.compose.material.icons.rounded.*
//import androidx.compose.runtime.*
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.snapshots.SnapshotStateList
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.geometry.Offset
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.SolidColor
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.ktx.auth
//import com.google.firebase.firestore.FirebaseFirestore
//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase
//import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
//import androidx.compose.foundation.Canvas as Canvas1
//import edu.uksw.fti.pam.pam_activityintent.R
//import edu.uksw.fti.pam.pam_activityintent.models.UserModel
//import edu.uksw.fti.pam.pam_activityintent.models.UserProfileViewModel
//import edu.uksw.fti.pam.pam_activityintent.ui.screns.*
//
//class HomeActivity : AppCompatActivity() {
//    private lateinit var auth: FirebaseAuth
//    private lateinit var db: FirebaseFirestore
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        auth = Firebase.auth
//        db = Firebase.firestore
//        val vm = UserProfileViewModel()
//        setContent {
//            PAM_ActivityIntentTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
////                    val username = getIntent().getStringExtra("username") ?: ""
//
////                    BottomNavigationMainScreenView()
////                    MyBottomNavigation()
////                    SetengahBunder()
////                    GreetingSection(name = String())
////                    NavigationQris()
//
////                    val bundle = intent.extras!!
////                    val namadepan = bundle.getString("namadepan", "")
////                    val namabelakang = bundle.getString("namabelakang", "")
//
//                    var userList = SnapshotStateList<UserModel?>()
//
//                    var db: FirebaseFirestore = FirebaseFirestore.getInstance()
//
//                    db.collection("users").get()
//                        .addOnSuccessListener { queryDocumentSnapshots ->
//                            if (!queryDocumentSnapshots.isEmpty) {
//                                val list = queryDocumentSnapshots.documents
//                                for (d in list) {
//                                    val c: UserModel? = d.toObject(UserModel::class.java)
//                                    userList.add(c)
//
//                                }
//                            } else {
//                                Toast.makeText(
//                                    this@HomeActivity,
//                                    "No data found in Database",
//                                    Toast.LENGTH_SHORT
//                                ).show()
//                            }
//                        }
//                        .addOnFailureListener {
//                            Toast.makeText(
//                                this@HomeActivity,
//                                "Fail to get the data.",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
////                    SetengahBunder()
////                    GreetingSection(userList,namadepan, namabelakang,
////                        saldo = "8.345.778")
//                    BottomNavigationMainScreenView()
//
//
//                }
//            }
//        }
//    }
//}


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
import edu.uksw.fti.pam.pam_activityintent.ui.screns.*

class HomeActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        db = Firebase.firestore
        val vm = UserProfileViewModel()
        setContent {
            PAM_ActivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
                    BottomNavigationMainScreenView()


                }
            }
        }
    }
}



