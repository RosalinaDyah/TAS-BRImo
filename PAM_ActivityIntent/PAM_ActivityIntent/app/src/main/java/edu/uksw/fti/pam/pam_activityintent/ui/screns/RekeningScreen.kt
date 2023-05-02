package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun Rekening() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_inpo),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 10.dp, end = 10.dp)
        ) {
            Text(
                text = stringResource(R.string.label_totalsaldo),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 15.dp)
            )
            Text(
                text = "Rp 8.345.778,00",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xff1763ce),
                modifier = Modifier.padding(top = 10.dp)
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .padding(top = 165.dp)
                .fillMaxWidth()
                .height(165.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        ) {
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp, top = 15.dp)
            ) {
                Text(
                    text = "608 801 027 700 538",
                    fontWeight = FontWeight.Light,
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                )
                Text(
                    text = "ROSALINA DYAH HANDIKA",
                    fontWeight = FontWeight.Light,
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 5.dp,)
                )
                Text(
                    text = "Rp 8.345.778,00",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 25.dp)
                )
                Text(
                    text = stringResource(R.string.label_view_mutation),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    textDecoration = TextDecoration.Underline,
                    color = Color(0xff1763ce),
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

            }
        }
        Row(
            //horizontalArrangement = Arrangement.End,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 300.dp)

        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce))
            ) {
                Text(
                    text = stringResource(R.string.label_bukarek),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }

    Row(
        modifier = Modifier
            .padding(top = 165.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.kartubri),
            contentDescription = "kartubri",
            modifier = Modifier
                .size(150.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun screen(){
    PAM_ActivityIntentTheme {
        Rekening()
    }
}