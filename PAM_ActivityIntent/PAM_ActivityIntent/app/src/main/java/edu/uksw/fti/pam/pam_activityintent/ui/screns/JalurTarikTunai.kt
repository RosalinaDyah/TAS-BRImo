package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
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
import edu.uksw.fti.pam.pam_activityintent.AtmActivity
import edu.uksw.fti.pam.pam_activityintent.IndomaretActivity
import edu.uksw.fti.pam.pam_activityintent.JalurTarikTunaiActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun JalurTarikTunaiScreen(){
    val lContext = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = stringResource(R.string.label_tarik),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
    Text(
        text = stringResource(R.string.label_Piljar),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color(0xff1763ce),
        modifier = Modifier
            .padding( top = 60.dp, start = 20.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            //.background(colorResource(id = R.color.white))
            .padding(20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 70.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(colorResource(id = R.color.white), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 35.dp, end = 30.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.atm),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 100.dp)
                .size(45.dp)
        )
    }
    Text(
        text = "ATM",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = Color.Black,
        modifier = Modifier
            .padding( top = 115.dp, start = 100.dp, end = 20.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 150.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(colorResource(id = R.color.white), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 35.dp, end = 30.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.indomaret),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 180.dp)
                .size(45.dp)
        )
    }
    Text(
        text = "Indomaret",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = Color.Black,
        modifier = Modifier
            .padding( top = 195.dp, start = 100.dp)
    )
    Column(
        modifier = Modifier
            .padding(top = 90.dp, start = 25.dp, end = 25.dp)
    ) {
        TextButton(
            onClick = {
                lContext.startActivity(
                    Intent(lContext, AtmActivity::class.java)
                )
            },
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = " ",
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
    Column(
        modifier = Modifier
            .padding(top = 170.dp, start = 25.dp, end = 25.dp)
    ) {
        TextButton(
            onClick = {
                lContext.startActivity(
                    Intent(lContext, IndomaretActivity::class.java)
                )
            },
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = " ",
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JalurTarikTunaiPreview() {
    PAM_ActivityIntentTheme {
        JalurTarikTunaiScreen()
    }
}