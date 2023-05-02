package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.graphics.Paint.Align
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun InternasionalScreen() {
//    val scrollState = rememberScrollState()
    var nomorbrizzi by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(state = scrollState)
    ) {
        Text(
            text = stringResource(R.string.label_international),
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
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(150.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFFFFFFF))
                )
        )
    }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, top = 80.dp)
    ) {
        Text(
            text = stringResource(R.string.label_last_purchase),
            fontWeight = FontWeight.Bold,
            color = Color(0xff1763ce),
            fontSize = 16.sp,
        )

        Image(
            painter = painterResource(R.drawable.bunder),
            contentDescription = "bunder",
            modifier = Modifier
                .size(70.dp)
                .padding(top = 10.dp)

        )
        Column(
            modifier = Modifier
                .padding(start = 15.dp)
        ) {
            Text(
                text = stringResource(R.string.label_none),
                fontWeight = FontWeight.Bold,
                color = Color(0xff1763ce),
                fontSize = 16.sp,
            )
        }
    }

    Box(
        modifier = Modifier
            .padding(top = 200.dp, start = 20.dp, end = 20.dp)
            .fillMaxHeight()
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(15.dp))
            .background(Color.White, shape = RoundedCornerShape(15.dp))
            .border(
                BorderStroke(2.dp, Color(0xFFE5E5E5))
            )
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 210.dp, start = 50.dp, end = 30.dp)
    ) {
        Text(
            text = stringResource(R.string.label_tf_list),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
            modifier = Modifier
                .padding(end = 15.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 17.dp)
                .fillMaxWidth()
                .height(40.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(Color(0xFFE5E5E5), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
//        Row(
//            modifier = Modifier
//        ) {
//            Icon(
//                Icons.Rounded.Search,
//                contentDescription = "cari",
//                tint = Color(0xff1763ce),
//                modifier = Modifier
//                    .size(30.dp)
//                    .padding(top = 100.dp)
//            )
//            Text(
//                text = stringResource(R.string.label_sc_list),
//                fontWeight = FontWeight.Bold,
//                fontSize = 14.sp,
//                color = Color(0xFF878787),
//                modifier = Modifier
//                    .padding( top = 100.dp ,start = 10.dp)
//            )
//        }
        Text(
            text = stringResource(R.string.label_none ),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding( top= 200.dp,start = 130.dp)
        )
        Row(
            //horizontalArrangement = Arrangement.End,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top =150.dp)

        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce))
            ) {
                Text(
                    text = stringResource(R.string.label_transferbaru ),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 165.dp, start = 10.dp, end = 30.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 90.dp, start = 50.dp)
        ) {
            Icon(
                Icons.Rounded.Search,
                contentDescription = "cari",
                tint = Color(0xff1763ce),
                modifier = Modifier
                    .size(30.dp)
            )
            Text(
                text = stringResource(R.string.label_sc_list),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color(0xFF878787),
                modifier = Modifier
                    .padding( start = 10.dp)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Internasional() {
    PAM_ActivityIntentTheme {
        InternasionalScreen()
    }
}