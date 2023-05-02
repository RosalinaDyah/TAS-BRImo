package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.CatatanBaruActivity
import edu.uksw.fti.pam.pam_activityintent.CatatanPengeluaranActivity
import edu.uksw.fti.pam.pam_activityintent.KonfirmasiAtmActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun CatatanKeuanganScreen() {
    val lContext = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(state = scrollState)
    ) {
        Text(
            text = stringResource(R.string.label_financial),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color(0xff1763ce),
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()

        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier
                    .width(170.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_income),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = { lContext.startActivity(
                    Intent(lContext, CatatanPengeluaranActivity::class.java)
                )
                },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier
                    .width(170.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_expenses),
                    color = Color(0xFF878787),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                )
            }
        }
        Text(
            text = stringResource(R.string.label_blmadapemasukan),
            color = Color(0xFF878787),
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 270.dp)
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 240.dp)
                .fillMaxWidth(),
            onClick = {lContext.startActivity(
                Intent(lContext, CatatanBaruActivity::class.java)
            ) }) {
            Text(
                text = stringResource(R.string.label_buatcatbaru),
                color = Color(0xfff8fbff)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CatatanPreview() {
    PAM_ActivityIntentTheme {
        CatatanKeuanganScreen()
    }
}