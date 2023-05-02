package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.KonfirmasiBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.PembayaranBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun PembayaranBrivaScreen() {
    val lContext = LocalContext.current
    var nomorbriva by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(state = scrollState)
    ) {
        Text(
            text = stringResource(R.string.label_briva),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.label_bayarbriva),
                color = Color(0xff1763ce),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(start = 10.dp, end = 30.dp)
            )
            {
                Image(
                    painter = painterResource(R.drawable.briva),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .size(50.dp)
                )
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = stringResource(R.string.label_nomortujuan),
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 20.dp, start = 20.dp)
                            .fillMaxWidth()
                    )
                    TextField(
                        value = nomorbriva,
                        placeholder = {
                            Text(stringResource(R.string.label_nomorbriva),
                                fontSize = 12.sp,
                            modifier = Modifier
                                .padding(start = 5.dp)) },
                        onValueChange = { nomorbriva = it },
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = Color.White
                        )
                    )

                }
            }
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .width(340.dp)
                    .padding(top = 470.dp, start = 10.dp),
                onClick =
                {lContext.startActivity(
                    Intent(lContext, KonfirmasiBrivaActivity::class.java)
                )
                }) {
                Text(
                    text = stringResource(R.string.label_lanjutkan),
                    color = Color(0xfff8fbff)
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PembayaranBriva() {
    PAM_ActivityIntentTheme {
        PembayaranBrivaScreen()
    }
}