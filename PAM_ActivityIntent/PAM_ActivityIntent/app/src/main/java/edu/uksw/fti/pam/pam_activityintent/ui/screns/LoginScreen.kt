package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.models.TodosViewModel
import edu.uksw.fti.pam.pam_activityintent.HomeActivity
import edu.uksw.fti.pam.pam_activityintent.contracts.SignUpContract
import edu.uksw.fti.pam.pam_activityintent.R


internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm(
//    vm: TodosViewModel
    onSignInAction: (String, String) -> Unit
) {
    val lContext = LocalContext.current
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! })

//    LaunchedEffect(Unit, block = { vm.getToDoList() })
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.bribiru),
            contentDescription = "logobribiru",
            modifier = Modifier
                .size(40.dp)
                .padding(top = 10.dp)
        )
        Image(
            painter = painterResource(R.drawable.brilog),
            contentDescription = "logodepanbri",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
        )
        Text(
            text = stringResource(R.string.login),
            fontWeight = FontWeight.Bold,
            color = Color(0xff1763ce),
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 25.dp)
        )
        TextField(
            value = usernameInput.toString(),
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(R.string.label_username)) },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xffcce2ff)
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = passwordInput.toString(),
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(R.string.label_password)) },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xffcce2ff)
            ),
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(),

            )
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {
//            var login = false
//            for (i in vm.toDoList) {
//                if (i.username == usernameInput) {
//                    login = true
//                }
//            }
            Button(
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                onClick = {
                    onSignInAction(usernameInput, passwordInput)
//                    if (login) {
//                        lContext.startActivity(
//                            Intent(lContext, HomeActivity::class.java)
//                        )
//                    }
//                    val isAuthenticated = doAuth(usernameInput, passwordInput)
//                    if (isAuthenticated) {
//                        lContext.startActivity(
//                            Intent(lContext, HomeActivity::class.java)
//                                .apply {
//                                    putExtra("username", usernameInput)
//                                }
//                        )
//                    }
                }
            )
            {
                Text(
                    text = stringResource(R.string.btn_login_title),
                    color = Color(0xfff8fbff)
                )
            }
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(start = 10.dp),
                onClick = {
                    getUsernameFromSignedUpForm.launch("")
                }
            )
            {
                Text(
                    text = stringResource(R.string.label_signup),
                    color = Color(0xfff8fbff)
                )
            }
        }
    }
}

