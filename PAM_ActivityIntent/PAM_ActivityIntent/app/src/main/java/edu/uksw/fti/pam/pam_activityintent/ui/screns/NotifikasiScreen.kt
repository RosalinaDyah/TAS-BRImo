package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun NotifikasiScreen() {

    data class Item(val id: Int, val tanggal: String, val judul: String, val gambar:Int, val namabawah: String)

    val items = listOf(
        Item(1, "18 Apr 2023 | 01:00", stringResource(R.string.label_mudik), R.drawable.brilog, stringResource(R.string.label_mudiklg)),
        Item(1, "13 Apr 2023 | 01:00", stringResource(R.string.label_tukarvalas), R.drawable.brilog, stringResource(R.string.label_tukarvalaslg)),
        Item(1, "01 Apr 2023 | 01:00", stringResource(R.string.label_mudikasik), R.drawable.brilog, stringResource(R.string.label_mudikasiklg))

            )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(state = scrollState)
    ) {
        Text(
            text = stringResource(R.string.label_notif),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            modifier = Modifier
                .padding(top = 20.dp)
                .background(colorResource(id = R.color.white))
        ) {
            items(items) { item ->
                Card(
                    backgroundColor = MaterialTheme.colors.background,
                    modifier = Modifier
                        .width(120.dp)
                        .height(135.dp)
                        .padding(5.dp)
                        .shadow(5.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(item.gambar),
                                contentDescription = item.tanggal,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(top = 20.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 10.dp, start = 10.dp)
                            ) {
                                Text(
                                    fontWeight = FontWeight.Bold,
                                    text = item.judul,
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                )
                                Text(
                                    text = item.namabawah,
                                    color = Color.Black,
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                                Text(
                                    text = item.tanggal,
                                    color = Color.Black,
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NotifPreview() {
    PAM_ActivityIntentTheme {
        NotifikasiScreen()
    }
}