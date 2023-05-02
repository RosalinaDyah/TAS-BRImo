package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.BayarListrikActivity
import edu.uksw.fti.pam.pam_activityintent.HomeActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun BayarListrik() {
    val lContext = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(state = scrollState)
    ) {
        Card(
            elevation = 10.dp,
            backgroundColor = (Color(0xff1763ce)),
            shape = RoundedCornerShape(size = 5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)

        ){
            Text(
                text = stringResource(R.string.label_bayarlistrik),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
        }
        Spacer(modifier = Modifier.padding(top = 20.dp),)
        Card(
            elevation = 10.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(bottom = 10.dp).padding(top = 20.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(

                    modifier = Modifier
                        .padding(start = 10.dp)
                        .height(40.dp)
                        .width(40.dp),
                    painter = painterResource(id = R.drawable.token),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 15.dp)) // gap between image and text
                Text(
                    text = stringResource(R.string.label_produklistrik),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )

            }
        }
        Card(
            elevation = 10.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(bottom = 10.dp).padding(top = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(

                    modifier = Modifier
                        .padding(start = 10.dp)
                        .height(40.dp)
                        .width(40.dp),
                    painter = painterResource(id = R.drawable.idcard),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 15.dp)) // gap between image and text
                Text(
                    text = stringResource(R.string.label_nomortujuan),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )




            }
        }
        Spacer(modifier = Modifier.padding(top = 350.dp),)
        Button(onClick = {lContext.startActivity(
            Intent(lContext, HomeActivity::class.java)
        ) },
            modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            content={
                Text(
                    text = stringResource(R.string.label_bayar),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                )})
    }


}


@Preview(showBackground = true)
@Composable
fun CardViewPreview() {
    PAM_ActivityIntentTheme {
        BayarListrik()
    }
}