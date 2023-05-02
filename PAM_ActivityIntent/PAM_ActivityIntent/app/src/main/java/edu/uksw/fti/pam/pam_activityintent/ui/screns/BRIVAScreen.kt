package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.*
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
import edu.uksw.fti.pam.pam_activityintent.PembayaranBrivaActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun BrivaScreen() {
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
                text = stringResource(R.string.label_briva),
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
                    text = stringResource(R.string.label_pembayaranterakhir),
                    color = Color(0xff1763ce),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth()
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp)
                )
                {
                    Image(
                        painter = painterResource(R.drawable.s),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .size(50.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.emerah),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .size(45.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.spotify),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .size(45.dp)
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                )
                {
                    Text(
                        text = "Susana As...",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 10.dp, end = 5.dp)
                    )
                    Text(
                        text = "Eben Hea...",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 10.dp, end = 5.dp)
                    )
                    Text(
                        text = "Spotify",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 10.dp, end = 15.dp)
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                )
                {
                    Text(
                        text = "183329029....",
                        color = Color(0xFF878787),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )
                    Text(
                        text = "666019263...",
                        color = Color(0xFF878787),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )
                    Text(
                        text = "Spotify",
                        color = Color(0xFF878787),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 15.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .fillMaxWidth()
                        .height(85.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .background(Color(0xFFE5E5E5), shape = RoundedCornerShape(15.dp))
                        .border(
                            BorderStroke(2.dp, Color(0xFFE5E5E5))
                        )
                )
                {
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
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
                            fontWeight = FontWeight.Bold,
                            color = Color(0xff1763ce),
                            modifier = Modifier
                                .padding(start = 10.dp)
                        )
                    }
                    Text(
                        text = stringResource(R.string.label_informasibriva),
                        color = Color.Black,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(top = 40.dp, start = 10.dp)
                    )
                }
                Text(
                    text = stringResource(R.string.label_daftarbriva),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xff1763ce),
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
                var text by remember { mutableStateOf("") }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text(text = stringResource(R.string.label_caridaftar)) },
                    leadingIcon = {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Search"
                            )
                        }
                    },
                    modifier = Modifier
                        .size(width = 500.dp, height = 60.dp)
                        .padding(top = 10.dp, end = 0.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                )

                Text(
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 120.dp)
                        .fillMaxWidth(),
                    text = stringResource(R.string.label_belumadadaftar),
                    color = Color.Gray
                )
                Row(
                    //horizontalArrangement = Arrangement.End,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 120.dp)

                ) {
                    Button(
                        onClick = {lContext.startActivity(
                            Intent(lContext, PembayaranBrivaActivity::class.java)
                        )
                },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(R.string.label_pembayaranbaru),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
}



@Preview(showBackground = true)
@Composable
fun Briva() {
    PAM_ActivityIntentTheme {
        BrivaScreen()
    }
}