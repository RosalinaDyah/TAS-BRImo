package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activityintent.*
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun PinData() {
    val lContext = LocalContext.current
    var pin by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(top = 200.dp),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(stringResource(R.string.label_masukkanpin),
            fontWeight = FontWeight.Bold, style = MaterialTheme.typography.h5)

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.Center) {
            for (i in 1..4) {
                val filled = i <= pin.length
                Box(
                    modifier = Modifier.size(48.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (filled) "*" else "",
                        style = MaterialTheme.typography.h6,
                        color = if (filled) Color.Black else Color.Black
                    )
                }

                if (i < 4) {
                    Spacer(modifier = Modifier.width(16.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = pin,
            onValueChange = { pin = it },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            label = { Text("PIN") },
            maxLines = 1,
            singleLine = true,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 270.dp, start = 20.dp,end=20.dp)
                .fillMaxWidth(),
            onClick = {lContext.startActivity(
                Intent(lContext, StrukPaketDataActivity::class.java)
            )
            }) {
            Text(
                text = stringResource(R.string.label_lanjutkan),
                color = Color(0xfff8fbff)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Pindata() {
    PAM_ActivityIntentTheme {
        PinData()
    }
}