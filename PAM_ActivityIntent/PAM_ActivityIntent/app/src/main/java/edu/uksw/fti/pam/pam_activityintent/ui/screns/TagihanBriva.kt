package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.PinBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun TagihanBrivaScreen() {
    val lContext = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.bluelopelope))
            .padding(20.dp)
//            .verticalScroll(state = scrollState)
    ) {
        Text(
            text = stringResource(R.string.label_tagihan),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
        Box(
            modifier = Modifier
                .padding(top = 50.dp, start = 20.dp, end = 20.dp)
                .fillMaxWidth()
                .height(355.dp)
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 75.dp)
                .fillMaxWidth()
        ) {
            Icon(
                Icons.Rounded.CheckCircle,
                contentDescription = "cek",
                tint = Color(0xFF1E90FF),
                modifier = Modifier
                    .size(60.dp)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 95.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.label_totalpembayaran),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 60.dp)
            )
            Text(
                text = "Rp 210.000",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color(0xff1763ce),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding()
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 230.dp, start = 60.dp)
        ) {
            Text(
                text = stringResource(R.string.label_nominaltagihan),
                color = Color.Black,
                fontSize = 14.sp,
                modifier = Modifier
            )
            Text(
                text = stringResource(R.string.label_biayaadmin),
                color = Color.Black,
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(top = 5.dp)
            )
            Text(
                text = stringResource(R.string.label_institusi),
                color = Color.Black,
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Text(
                text = "Tik Tok Shop",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier
            )
            Text(
                text = stringResource(R.string.label_namapelanggan),
                color = Color.Black,
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Text(
                text = "ROSALINA DYAH HANDIKA",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(end = 200.dp)
            )
        }
            Column(
                modifier = Modifier
                    .padding(top = 230.dp, start = 200.dp)
            ) {
                Text(
                    text = "Rp 210.000",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                )
                Text(
                    text = "Rp 0",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
                Text(
                    text = stringResource(R.string.label_nomorbriva),
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 20.dp)
                )
                Text(
                    text = "1136749253749638",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
                Text(
                    text = stringResource(R.string.label_keteranganbriva),
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 20.dp)
                )
                Text(
                    text = "BRIVA",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(end = 20.dp)
                )
        }
    Box(
        modifier = Modifier
            .padding(top = 510.dp)
            .fillMaxWidth()
            .height(400.dp)
            .background(Color(0xFFFFFFFF))
    ) {
        Text(
            text = stringResource(R.string.label_sumberdana),
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 25.dp, start = 10.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.r),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(45.dp)
            )
            Column(
            ) {
                Text(
                    text = "Rosalina Dyah Handika",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 20.dp, start = 20.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = "608801027700538",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                )
            }
        }
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 125.dp, start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            onClick = {lContext.startActivity(
                Intent(lContext, PinBrivaActivity::class.java)
            )
            })  {
            Text(
                text = stringResource(R.string.label_bayar),
                color = Color(0xfff8fbff)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun TagihanBriva() {
    PAM_ActivityIntentTheme {
        TagihanBrivaScreen()
    }
}