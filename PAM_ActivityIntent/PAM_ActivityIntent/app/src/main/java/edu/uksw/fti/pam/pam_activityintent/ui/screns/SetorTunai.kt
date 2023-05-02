package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.DetailSetorActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun SetorTunai() {
    val lContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()

            .padding(20.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        Card(
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
            .padding(top = 30.dp)
            .shadow(20.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp).padding(bottom = 20.dp)) {
                Text(
                    text = stringResource(R.string.label_nomortujuan),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Column(modifier = Modifier
                .padding(top = 30.dp)
                .padding(horizontal = 20.dp))
            {
                Card(
                    shape = RoundedCornerShape(size = 12.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(bottom = 10.dp).padding(top = 30.dp)

                ) {
                    Row(
                        modifier = Modifier.padding(all = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp),
                            painter = painterResource(id = R.drawable.ucok),
                            contentDescription = "lucy pic",
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(width = 15.dp)) // gap between image and text
                        Text(
                            text = "6088 0102 7700", fontSize = 20.sp, fontWeight = FontWeight.SemiBold,
                        )
                        Spacer(modifier = Modifier.width(width = 40.dp))
                        Image(
                            modifier = Modifier
                                .clip(shape = CircleShape)
                                .height(40.dp)
                                .width(40.dp),
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "lucy pic",
                            contentScale = ContentScale.Crop
                        )
                    }
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
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
        Spacer(modifier = Modifier.padding(top = 370.dp),
        )
        Button(onClick = {lContext.startActivity(
            Intent(lContext, DetailSetorActivity::class.java)
        )},
            modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            content={
                Text(text = "Next",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
            })

    }
}

@Preview(showBackground = true)
@Composable
fun SetorTunaiPreview() {
    PAM_ActivityIntentTheme {
        SetorTunai()
    }
}