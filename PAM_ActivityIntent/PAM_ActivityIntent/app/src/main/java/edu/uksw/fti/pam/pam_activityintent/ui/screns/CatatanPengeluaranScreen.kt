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
import edu.uksw.fti.pam.pam_activityintent.CatatanBaruKeluarActivity
import edu.uksw.fti.pam.pam_activityintent.CatatanPemasukanActivity
import edu.uksw.fti.pam.pam_activityintent.CatatanPengeluaranActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun CatatanPengeluaranScreen() {
    val lContext = LocalContext.current
    data class Item(val id: Int, val tanggal: String, val pengeluaran: String, val gambar:Int, val namabawah: String, val pt:String)

    val items = listOf(
        Item(1, "22 April 2023", "- Rp 30.000", R.drawable.tariktunai, stringResource(R.string.label_uangkeluar), "Bank BRI - 73937292923224520"),
        Item(2, "11 April 2023", "- Rp 60.000", R.drawable.tariktunai, stringResource(R.string.label_uangkeluar), "Bank BRI - 99032424848299383"),
        Item(3, "25 Maret 2023", "- Rp 153.000", R.drawable.tariktunai, stringResource(R.string.label_belanja),"PT. Nusa Persero Indah - 00749...")


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
            text = stringResource(R.string.label_financial),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color(0xff1763ce),
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Button(
                onClick = {lContext.startActivity(
                    Intent(lContext, CatatanPemasukanActivity::class.java)
                )},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier
                    .width(170.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_income),
                    textAlign = TextAlign.Center,
                    color = Color(0xFF878787),
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = {
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier
                    .width(170.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_expenses),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                )
            }
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
                        .height(110.dp)
                        .padding(8.dp)
                        .shadow(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                text = item.tanggal,
                                color = Color(0xff1763ce),
                                fontSize = 14.sp,
                            )
                            Text(
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                text = item.pengeluaran,
                                color = Color(0xff1763ce),
                                fontSize = 14.sp,
                            )
                        }
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
                                    .padding(top = 20.dp, start = 10.dp)
                            ) {
                                Text(
                                    fontWeight = FontWeight.Bold,
                                    text = item.namabawah,
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                )
                                Text(
                                    text = item.pt,
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                )
                            }
                        }

                    }

                }
            }
        }
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 190.dp)
                .fillMaxWidth(),
            onClick = { lContext.startActivity(
                Intent(lContext, CatatanBaruKeluarActivity::class.java)
            )}) {
            Text(
                text = stringResource(R.string.label_buatcatbaru),
                color = Color(0xfff8fbff)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CatatanKeluarPreview() {
    PAM_ActivityIntentTheme {
        CatatanPengeluaranScreen()
    }
}