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
import edu.uksw.fti.pam.pam_activityintent.KonfirmasiPaketDataActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.TagihanDataActivity
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun KonfirmasiDataScreen() {
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
            text = stringResource(R.string.label_pulsadandata),
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
                text = stringResource(R.string.label_nomortujuan),
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
                    painter = painterResource(R.drawable.indosat),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .size(45.dp)
                )
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "INDOSAT OOREDOO",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 20.dp, start = 20.dp)
                            .fillMaxWidth()
                    )
                    Text(
                        text = "085882158665 - Paket Data",
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
                    text = stringResource(R.string.label_sumberdana),
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
                        painter = painterResource(R.drawable.r),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .size(45.dp)
                    )
                    Column(
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
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(top = 400.dp)
                        .fillMaxWidth(),
                    onClick = {
                        lContext.startActivity(
                            Intent(lContext, TagihanDataActivity::class.java)
                        )
                    }) {
                    Text(
                        text = stringResource(R.string.label_beli),
                        color = Color(0xfff8fbff)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun KonfirmasiDta() {
    PAM_ActivityIntentTheme {
        KonfirmasiDataScreen()
    }
}