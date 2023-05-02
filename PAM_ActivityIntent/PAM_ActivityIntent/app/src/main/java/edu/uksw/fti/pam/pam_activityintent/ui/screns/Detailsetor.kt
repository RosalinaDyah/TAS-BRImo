package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.HomeActivity
import edu.uksw.fti.pam.pam_activityintent.PembayaranBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun Detailsetor() {
    val lContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        Card(
            elevation = 10.dp,
            backgroundColor = (Color(0xff1763ce)),
            shape = RoundedCornerShape(size = 5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .shadow(20.dp)

        ){
            Text(
                text = stringResource(R.string.label_setortunai),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .width(370.dp)
            .padding(top = 20.dp)
            .shadow(20.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = stringResource(R.string.label_nomortujuan),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal
                )
                Text("6088 0102 7700 538", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }

            Column(modifier = Modifier
                .padding(top = 80.dp)
                .padding(horizontal = 20.dp))
            {
                Text(
                    text = stringResource(R.string.label_nomortujuan),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal
                )
                Row(
                    modifier = Modifier.padding(top = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {

                    Text(
                        text = "341942 ",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(width = 120.dp))
                    Button(onClick = {},modifier = Modifier
                        .width(80.dp)
                        .height(40.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                        content={
                            Text(
                                text = stringResource(R.string.label_salin),
                                fontSize = 11.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        })
                }

            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 190.dp)
                    .padding(bottom = 20.dp)
                    .padding(horizontal = 20.dp)
            ) {

                Text(
                    text = "------------------------------------------------------------------ ",
                    fontWeight = FontWeight.Light,
                )
                Row(
                    modifier = Modifier.padding(top = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,

                    ) {

                    Text(
                        text = stringResource(R.string.label_bataswaktu),
                        fontSize = 13.sp,

                        fontWeight = FontWeight.Bold
                    )



                    Spacer(modifier = Modifier.width(width = 65.dp))
                    Text(
                        text = stringResource(R.string.label_jam),
                        fontSize = 13.sp,

                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .width(370.dp)
            .padding(top = 10.dp)
            .shadow(20.dp)
        ) {
            Column(modifier = Modifier.padding(10.dp))
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        Icons.Rounded.Warning,
                        contentDescription = "warning",
                        tint = Color(0xff1763ce),
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Text(
                        text = stringResource(R.string.label_informasi),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Column(modifier = Modifier
                .padding(top = 50.dp)
                .padding(horizontal = 20.dp)
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = stringResource(R.string.label_keterangan),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 130.dp)
                    .padding(bottom = 20.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_informasilanjut),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.padding(top = 230.dp),
        )
        Button(onClick = {lContext.startActivity(
            Intent(lContext, HomeActivity::class.java)
        )},
            modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            content={
                Text(text = "OK",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
            })
    }


}

@Preview(showBackground = true)
@Composable
fun DetailsetorPreview() {
    PAM_ActivityIntentTheme {
        Detailsetor()
    }
}