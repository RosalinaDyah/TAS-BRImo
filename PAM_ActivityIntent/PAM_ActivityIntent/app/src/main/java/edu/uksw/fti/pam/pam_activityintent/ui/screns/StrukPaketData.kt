package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
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
import edu.uksw.fti.pam.pam_activityintent.HomeActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.StrukBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun StrukPaketDataScreen() {
    val lContext = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.abu))
    ) {
        Text(
            text = " ",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF3399FF))
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.abu))
                .padding(10.dp)
//            .verticalScroll(state = scrollState)
        ){
            Box(
                modifier = Modifier
                    .padding(top = 10.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .height(460.dp)
                    .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 120.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.bribiru),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(top = 20.dp)
        )
        Text(
            text = stringResource(R.string.label_transaksiberhasil),
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 10.dp)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 230.dp, start = 50.dp)
    ) {
        Text(
            text = stringResource(R.string.label_tanggal),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = stringResource(R.string.label_nomorreferensi),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = stringResource(R.string.label_sumberdana),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            text = "",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            modifier = Modifier
        )
        Text(
            text = stringResource(R.string.label_jenistransaksi),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            text = stringResource(R.string.label_nomortujuan),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = stringResource(R.string.label_provider),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )

        Text(
            text = stringResource(R.string.label_nominal),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            text = stringResource(R.string.label_biayaadmin),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = stringResource(R.string.label_total),
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 25.dp)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 230.dp, start = 180.dp, end = 30.dp)
    ) {
        Text(
            text = "2023-06-19 09:05:41 WIB",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = "4264832734789299",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = "ROSALINA DYAH HANDIKA",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            text = "6034 **** **** 539",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
        )
        Text(
            text = stringResource(R.string.label_paketdata),
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            text = "085882158665",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = "Indosat Ooredoo",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )

        Text(
            text = "Rp 80.000",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            text = "Rp 1.500",
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = "Rp 81.500",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 25.dp)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 635.dp, start = 20.dp, end = 20.dp)
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {lContext.startActivity(
                Intent(lContext, HomeActivity::class.java)
            )
            }) {
            Text(
                text = "OK",
                color = Color(0xfff8fbff)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun StrukPaketData() {
    PAM_ActivityIntentTheme {
        StrukPaketDataScreen()
    }
}