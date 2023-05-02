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
import edu.uksw.fti.pam.pam_activityintent.KonfirmasiPaketDataActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun JenisValasScreen() {
    val lContext = LocalContext.current
    data class Item(val id: Int, val gambar:Int, val namabawah: String, val pt:String)

    val items = listOf(
        Item(1, R.drawable.kartubri, "BritAma", stringResource(R.string.label_britama)),
        Item(2, R.drawable.kartubri, "Simpedes Si Serba Bisa", stringResource(R.string.label_simpedes)),
        Item(3, R.drawable.kartubri, "Simpedes Bisa", stringResource(R.string.label_simpedesbisa)),
        Item(4, R.drawable.kartubri, "BritAma Valas", stringResource(R.string.label_britamavalas)),
        Item(5, R.drawable.kartubri, "BritAma Bisnis", stringResource(R.string.label_britamabisnis)),
        Item(6, R.drawable.kartubri, "BritAma Rencana", stringResource(R.string.label_britamarencana))
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
            text = stringResource(R.string.label_bukarekk),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )

            Column() {
                Text(
                    text = stringResource(R.string.label_pilihjenistab),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                )
                Text(
                    text = stringResource(R.string.label_pilihtabungan),
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .fillMaxWidth()

                )
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                modifier = Modifier
//                .padding(5.dp)
                    .background(colorResource(id = R.color.white))
            ) {
                items(items) { item ->
                    Card(
                        backgroundColor = MaterialTheme.colors.background,
                        modifier = Modifier
                            .width(100.dp)
                            .padding(top = 10.dp)
                            .shadow(5.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(end = 10.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(item.gambar),
                                    contentDescription = item.namabawah,
                                    modifier = Modifier
                                        .size(90.dp)
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 10.dp, start = 10.dp)
                                ) {
                                    Text(
                                        fontWeight = FontWeight.Bold,
                                        text = item.namabawah,
                                        color = Color.Black,
                                        fontSize = 16.sp,
                                    )
                                    Text(
                                        text = item.pt,
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                    )
                                }
                            }
                            Button(
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .padding(start = 5.dp, end = 5.dp, top = 20.dp)
                                    .fillMaxWidth(),
                                onClick = {
                                }) {
                                Text(
                                    text = stringResource(R.string.label_view_details),
                                    color = Color(0xff1763ce)
                                )
                            }
                        }

                    }
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun ValasPreview() {
    PAM_ActivityIntentTheme {
        JenisValasScreen()
    }
}