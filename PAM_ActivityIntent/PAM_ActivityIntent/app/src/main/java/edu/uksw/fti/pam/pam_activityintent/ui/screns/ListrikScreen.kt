package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import edu.uksw.fti.pam.pam_activityintent.BayarListrikActivity
import edu.uksw.fti.pam.pam_activityintent.CatatanPemasukanActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun Listrik() {
    val lContext = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_electricity),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 10.dp, end = 30.dp)
        ) {
            Text(
                text = stringResource(R.string.label_last_transaction),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color(0xff1763ce),
                modifier = Modifier.padding(top = 0.dp)
            )

            Image(
                painter = painterResource(R.drawable.e),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 25.dp, top = 10.dp)
                    .size(45.dp)
            )
            Column(
                modifier = Modifier
            ) {
                Text(
                    text = "EBEN HE...",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 5.dp, start = 15.dp)
                )
                Text(
                    text = "Bank BRI",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF878787),
                    modifier = Modifier
                        .padding(start = 20.dp)
                )
            }
        }
    }

    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, top = 210.dp, end = 30.dp)
    ) {
        Text(
            text = stringResource(R.string.label_tokenlistrik),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color(0xff1763ce),
            modifier = Modifier
        )
        Text(
            text = stringResource(R.string.label_cetakulanglistrik),
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier
        )
        Text(
            text = stringResource(R.string.label_daftarlistrik),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color(0xff1763ce),
            modifier = Modifier
                .padding(top = 20.dp)
        )
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = {text = it},
            label = { Text(text = stringResource(R.string.label_caridaftar))},
            leadingIcon = {
                IconButton(onClick = {  }) {
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "Search")
                }
            },
            modifier = Modifier
                .size(width = 500.dp, height = 60.dp)
                .padding(top = 10.dp, end = 10.dp)
                .clip(shape = RoundedCornerShape(15.dp))
        )

        Text(
            modifier = Modifier
                .padding(start = 100.dp,top = 140.dp),
            text = stringResource(R.string.label_belumadadaftar),
            color = Color.Gray
        )


        Row(
            //horizontalArrangement = Arrangement.End,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 140.dp)

        ) {
            Button(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, BayarListrikActivity::class.java)
                    )
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.label_tambahpenerima),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ListrikPreview(){
    PAM_ActivityIntentTheme {
        Listrik()
    }
}