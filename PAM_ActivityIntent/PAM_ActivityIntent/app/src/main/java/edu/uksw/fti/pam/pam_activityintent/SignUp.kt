package edu.uksw.fti.pam.pam_activityintent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import edu.uksw.fti.pam.pam_activityintent.models.UserModel
import edu.uksw.fti.pam.pam_activityintent.models.UserProfile
import edu.uksw.fti.pam.pam_activityintent.ui.screns.SignUpForm
import edu.uksw.fti.pam.pam_activityintent.ui.screns.addDataToFirebase
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

//class SignUp : AppCompatActivity() {
//    private lateinit var auth: FirebaseAuth
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        auth = Firebase.auth
//        setContent {
//            PAM_ActivityIntentTheme() {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    SignUpForm(onClickAction = ::sendUsernameBackToLoginPage)
//                }
//            }
//        }
//    }
////    private fun sendUsernameBackToLogin(username: String?) {
////        val result = Intent().putExtra("username", username)
////        setResult(Activity.RESULT_OK, result)
////        finish()
////    }
//
//    private fun sendUsernameBackToLoginPage(
//        firstnameInput: String,
//        lastnameInput: String,
//        username: String,
//        password: String,
//    ) {
//        val errorToast = Toast.makeText(applicationContext, "Error Create User", Toast.LENGTH_SHORT)
//
//        auth.createUserWithEmailAndPassword(username, password)
//            .addOnCompleteListener {
//                if (it.isSuccessful) {
//                    val user : FirebaseUser = it.result.user!!
//                    addDataToFirebase(
//                        UserModel(user.uid, firstnameInput, lastnameInput, user.email!!, password),
//                        { userModel ->
//                            if (userModel!=null){
//                                setResult(
//                                    Activity.RESULT_OK,
//                                    Intent().putExtra("username", userModel.email)
//                                )
//                                Toast.makeText(
//                                    applicationContext, "User created", Toast.LENGTH_SHORT).show()
//                                finish()
//                            } else {
//                                errorToast.show();
//                            }
//                        },
//                        {
//                            errorToast.show();
//                        }
//                    )
//                }
//                else {
//                    errorToast.show();
//                }
//            }
//    }
//}



class SignUp : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        db = Firebase.firestore
        setContent {
            PAM_ActivityIntentTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SignUpForm(onClickAction = ::sendUsernameBackToLoginPage)
                }
            }
        }
    }

    private fun sendUsernameBackToLoginPage(
        nama: String?,
        username: String?,
        password: String?
    ) {
        auth.createUserWithEmailAndPassword(username!!, password!!)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    val userUid = it.result.user?.uid
                    val userData = UserProfile(nama!!)
                    db.collection("halo")
                        .document(userUid!!)
                        .set(userData)
                        .addOnCompleteListener {
                            val result = Intent().putExtra("username", username)
                            setResult(Activity.RESULT_OK, result)
                            finish()
                        }
                } else {
                    Toast.makeText(applicationContext, "Error Create User", Toast.LENGTH_SHORT).show()
                }
            }
    }

}