package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.uksw.fti.pam.pam_activityintent.MainActivity
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.contracts.SignUpContract
import edu.uksw.fti.pam.pam_activityintent.datastore.StoreUserFirstName
import edu.uksw.fti.pam.pam_activityintent.datastore.StoreUserLastName
import edu.uksw.fti.pam.pam_activityintent.models.DataViewModel
import edu.uksw.fti.pam.pam_activityintent.models.UserModel
import coil.compose.rememberImagePainter

@Composable
fun ProfileScreen(
//    dataViewModel: DataViewModel = viewModel(),
//    vm: UserProfileViewModel
    userList: SnapshotStateList<UserModel?>,
    namadepan: String,
    namabelakang: String,
    email : String
//    firstnameInput: String,
//    lastnameInput: String
) {
//    val getData = dataViewModel.state.value
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore1.getLastName.collectAsState(initial = "")

    val notification = rememberSaveable { mutableStateOf("") }
    if (notification.value.isNotEmpty()) {
        Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
        notification.value = ""
    }

    var usernameInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! })

    Box(
        modifier = Modifier
            .height(250.dp)
            .fillMaxSize()
            .background(Color(0xff1763ce))

    )
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.label_profile),
                modifier = Modifier,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
        }

        ProfileImage(userList = SnapshotStateList<UserModel?>(), namadepan = String(), namabelakang = String())
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .height(300.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(5.dp, Color(0xFFE5E5E5))
                )
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 20.dp, end = 4.dp),
//                verticalAlignment = Alignment.CenterVertically
            ) {

//                Text(text = stringResource(R.string.label_first_name))
//                Text(
//                    text = ":",
//                    modifier = Modifier
//                        .padding(start = 10.dp, end = 4.dp))
//                Text(
//                    text = "$namadepan",
//                    color = Color.Black,
//                    modifier = Modifier
//                        .padding(start = 10.dp, end = 4.dp)
//                )
////                Text(
////                    text = getData.firstnameInput,
////                    color = Color.Black,
////                    modifier = Modifier
////                        .padding(start = 10.dp, end = 4.dp)
////                )
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 60.dp, start = 20.dp, end = 4.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(text = stringResource(R.string.label_last_name))
//                Text(
//                    text = ":",
//                    modifier = Modifier
//                        .padding(start = 10.dp, end = 4.dp)
//                )
////                Text(
////                    text = getData.lastnameInput,
////                    color = Color.Black,
////                    modifier = Modifier
////                        .padding(start = 10.dp, end = 4.dp)
////                )
//                Text(
//                    text = "$namabelakang",
//                    color = Color.Black,
//                    modifier = Modifier
//                        .padding(start = 10.dp, end = 4.dp)
//                )
//            for (i in userList) {
//                if (i != null) {
//                    Text(text = i.email,
//                        color = Color.Black,
//                        modifier = Modifier
//                            .padding(start = 10.dp, end = 4.dp))
//                }
//            }
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 100.dp, start = 20.dp, end = 4.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(text = stringResource(R.string.label_username))
//                Text(
//                    text = ":",
//                    modifier = Modifier
//                        .padding(start = 15.dp, end = 4.dp))
//                Text(
//                    text = "$email",
//                    color = Color.White,
//                    modifier = Modifier
//                        .padding(start = 10.dp, end = 4.dp)
//                )
////                Text(
////                    text = "rosalina28",
////                    color = Color.Black,
////                    modifier = Modifier
////                        .padding(start = 10.dp, end = 4.dp)
////                )
////                for (i in userList) {
////                    if (i != null) {
////                        Text(text = i.email)
////                    }
////                }
//            }
//
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 140.dp, start = 20.dp, end = 4.dp),
//                verticalAlignment = Alignment.Top
//            ) {
                Text(
                    text = "Bio"
                )
                Text(
                    text = ":",
                    modifier = Modifier
                        .padding(start = 65.dp))
                Column(
                ) {
//                    Text(
//                        text = "$namadepan",
//                        color = Color.White,
//                        modifier = Modifier
//                            .padding(start = 10.dp, end = 4.dp)
//                    )
                    Text(
                        text = "KELOMPOK BRIMO",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 4.dp)
                    )
                    Text(
                        text = "Rosalina Dyah Handika (672020045)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 4.dp)
                    )
                    Text(
                        text = "Rika Ratri Anggraeni (672020058)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 8.dp, start = 10.dp, end = 4.dp)
                    )
                    Text(
                        text = "Ega Fitri Yudha Satria Utama (672020068)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 8.dp, start = 10.dp, end = 4.dp)
                    )
                    Text(
                        text = "Nita Fuji Astuti (672020039)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 8.dp, start = 10.dp, end = 4.dp)
                    )
                    Text(
                        text = "Ignatius Christanto (672020061)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 8.dp, start = 10.dp, end = 4.dp)
                    )
                }
            }
        }
        LogOut()
    }
}

@Composable
fun ProfileImage(
    userList: SnapshotStateList<UserModel?>,
    namadepan: String,
    namabelakang: String,

) {
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore1.getLastName.collectAsState(initial = "")

    val imageUri = rememberSaveable { mutableStateOf("") }

    val painter = rememberImagePainter(
        if (imageUri.value.isEmpty())
            R.drawable.r
        else
            imageUri.value
    )

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { imageUri.value = it.toString() }
    }

    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = CircleShape,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)

        ) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize()
                    .fillMaxSize()
                    .clickable { launcher.launch("image/*") },
                contentScale = ContentScale.Crop
            )
        }
        Row() {
            Text(
                text = "$namadepan",
                color = Color.White,
                modifier = Modifier
                    .padding(start = 10.dp, end = 4.dp)
            )
            Text(
                text = "$namabelakang",
                color = Color.White,
                modifier = Modifier
                    .padding(start = 10.dp, end = 4.dp)
            )
//            Text(
//                text = savedFirstName.value!!,
//                color = Color.White,
//                fontSize = 18.sp,
//                modifier = Modifier
//                    .padding(start = 10.dp)
//            )
//            Text(
//                text = "$firstnameInput",
//                color = Color.Black,
//                modifier = Modifier
//                    .padding(start = 10.dp, end = 4.dp)
//            )
//            Text(
//                text = "$lastnameInput",
//                color = Color.Black,
//                modifier = Modifier
//                    .padding(start = 10.dp, end = 4.dp)
//            )
//            Text(
//                text = savedLastName.value!!,
//                color = Color.White,
//                fontSize = 18.sp,
//                modifier = Modifier
//                    .padding(start = 2.dp, end = 4.dp)
//            )
        }

    }
}

@Composable
fun LogOut() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        val isShowAlert = remember { mutableStateOf(false) }
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(340.dp)
                .padding(start = 10.dp),

            onClick = { isShowAlert.value = true}) {
            Text(
                text = stringResource(R.string.label_logout),
                color = Color(0xfff8fbff)
            )
        }
        if (isShowAlert.value)
            AlertDialogView(state = isShowAlert)
    }
}

@Composable
fun AlertDialogView(state: MutableState<Boolean>) {
    CommonDialog(title = stringResource(R.string.label_confirmation), state = state) {
        Text( text = stringResource(R.string.label_exitapp))
    }
}

@Composable
fun CommonDialog(
    title: String?,
    state: MutableState<Boolean>,
    content: @Composable (() -> Unit)? = null
) {
    val lContext = LocalContext.current
    AlertDialog(
        onDismissRequest = {
            state.value = false
        },
        title = title?.let {
            {
                Column(
                    Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(text = title)
                    Divider(modifier = Modifier.padding(bottom = 8.dp))
                }
            }
        },
        text = content,
        dismissButton = {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                shape = RoundedCornerShape(10.dp),
                onClick = { state.value = false }) {
                Text(
                    text = stringResource(R.string.label_cancle),
                    color = Color.White
                )
            }
        },
        confirmButton = {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, MainActivity::class.java)
                    )
                }) {
                Text(
                    text = stringResource(R.string.label_yes),
                    color = Color.White
                )
            }
        }, modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    PAM_ActivityIntentTheme {
//        ProfileScreen()
    }
}