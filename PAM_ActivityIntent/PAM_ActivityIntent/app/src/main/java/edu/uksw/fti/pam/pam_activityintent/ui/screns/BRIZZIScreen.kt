package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Warning
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
fun BrizziScreen() {
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
            text = stringResource(R.string.label_brizzi),
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
            text = stringResource(R.string.label_topup_brizzi),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
            modifier = Modifier
                .padding(end = 15.dp)
        )
        Row(
            modifier = Modifier
                .padding(start = 10.dp, end = 30.dp)

        ) {
            Image(
                painter = painterResource(R.drawable.brizzi),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(50.dp)
            )
            Column(
                modifier = Modifier
            ) {
                Text(
                    text = stringResource(R.string.label_card_number),
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 20.dp, start = 20.dp)
                )
                TextField(
                    value = nomorbrizzi,
                    placeholder = { Text("Nomor BRIZZI") },
                    onValueChange = { nomorbrizzi = it },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White
                    )
                )

            }

        }

    }
    Box(
        modifier = Modifier
            .padding(top = 550.dp, start = 40.dp, end = 40.dp, bottom = 40.dp)
            .height(120.dp)
            .fillMaxWidth()
            .background(Color(0xFFE5E5E5), shape = RoundedCornerShape(15.dp))
            .border(
                BorderStroke(2.dp, Color(0xFFE5E5E5))
            )
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 560.dp, start = 50.dp, end = 40.dp)
    ) {
        Icon(
            Icons.Rounded.Warning,
            contentDescription = "Warning",
            tint = Color.Blue,
            modifier = Modifier
                .size(24.dp)

        )
        Spacer(modifier = Modifier.width(width = 10.dp))
        Text(
            text = stringResource(R.string.label_information),
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontSize = 14.sp,
        )

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 590.dp, start = 50.dp, end = 40.dp)
    ) {
        Text(
            text = stringResource(R.string.label_one),
            color = Color.Black,
            fontSize = 9.sp,
        )
        Text(
            text = stringResource(R.string.label_two),
            color = Color.Black,
            fontSize = 9.sp,

            )
    }

}



@Preview(showBackground = true)
@Composable
fun Brizzi() {
    PAM_ActivityIntentTheme() {
        BrizziScreen()
    }
}
