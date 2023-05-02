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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.PinBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.PinPulsaActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun TagihanPulsaScreen() {
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
            text = stringResource(R.string.label_confirmation),
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
                text = stringResource(R.string.label_sumberdana),
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
                    painter = painterResource(R.drawable.r),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .size(45.dp)
                )
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "ROSALINA DYAH HANDIKA",
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
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.label_nomortujuan),
                    color = Color(0xff1763ce),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 15.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 30.dp)
                )
                {
                    Image(
                        painter = painterResource(R.drawable.indosat),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .size(45.dp)
                    )
                    Column(
                    ) {
                        Text(
                            text = "Indosat Ooredoo",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(top = 30.dp, start = 20.dp)
                                .fillMaxWidth()
                        )
                    }
                }

                Text(
                    text = stringResource(R.string.label_detail),
                    color = Color(0xff1763ce),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 20.dp)
                )
                Text(
                    text = stringResource(R.string.label_nominal),
                    color = Color(0xFF878787),
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 15.dp)
                )
                Text(
                    text = stringResource(R.string.label_biayaadmin),
                    color = Color(0xFF878787),
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
                Text(
                    text = stringResource(R.string.label_total),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 25.dp)
                )
            }
        }
    }
    Column(
        modifier = Modifier
            .padding(end = 25.dp, top = 300.dp)
    ) {
        Text(
            text = "Rp 50.000",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(start = 260.dp)
        )
        Text(
            text = "Rp 1.500",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 5.dp, start = 260.dp)
        )
        Text(
            text = "Rp 51.500",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 25.dp, start = 260.dp)
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 260.dp, start = 20.dp)
                .fillMaxWidth(),
            onClick = {
                lContext.startActivity(
                    Intent(lContext, PinPulsaActivity::class.java)
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
fun TagihanPulsa() {
    PAM_ActivityIntentTheme {
        TagihanPulsaScreen()
    }
}