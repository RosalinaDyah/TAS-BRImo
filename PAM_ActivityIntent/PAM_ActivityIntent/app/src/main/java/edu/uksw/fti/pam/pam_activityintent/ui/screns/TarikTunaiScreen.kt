package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.*
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
import edu.uksw.fti.pam.pam_activityintent.BrivaActivity
import edu.uksw.fti.pam.pam_activityintent.JalurTarikTunaiActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun TarikTunaiScreen(){
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
        text = stringResource(R.string.label_SumbDan),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color(0xff1763ce),
        modifier = Modifier.padding(top = 55.dp, start = 20.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 80.dp, start = 20.dp, end = 20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White,
                    shape = RoundedCornerShape(15.dp))
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
            painter = painterResource(R.drawable.r),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 110.dp)
                .size(45.dp)
        )
    }
    Text(
        text = "0123 2345 1243 123",
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color.Black,
        modifier = Modifier
            .padding(top = 105.dp, start = 100.dp)
    )
    Text(
        text = "Rp8 451.000,00",
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF878787),
        modifier = Modifier
            .padding(top = 130.dp, start = 100.dp)
    )
    Text(
        text = ">",
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        color = Color(0xff1763ce),
        modifier = Modifier
            .padding( top = 110.dp, start = 310.dp, end = 20.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 160.dp, start = 20.dp, end = 20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White,
                    shape = RoundedCornerShape(15.dp))
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
            painter = painterResource(R.drawable.tariktunai),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 185.dp)
                .size(45.dp)
        )
    }

    Text(
        text =stringResource(R.string.label_JalurTar),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF878787),
        modifier = Modifier
            .padding(top = 185.dp, start = 100.dp)
    )
    Text(
        text =stringResource(R.string.label_Piljar),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color.Black,
        modifier = Modifier
            .padding(top = 210.dp, start = 100.dp)
    )
    Text(
        text = ">",
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        color = Color(0xff1763ce),
        modifier = Modifier
            .padding( top = 190.dp, start = 310.dp, end = 20.dp)
    )
    Column(
        modifier = Modifier
            .padding(start = 20.dp, top = 175.dp, end = 20.dp)
    ) {
        TextButton(
            onClick = {
                lContext.startActivity(
                    Intent(lContext, JalurTarikTunaiActivity::class.java)
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
fun TarikTunaiPreview() {
    PAM_ActivityIntentTheme {
        TarikTunaiScreen()
    }
}