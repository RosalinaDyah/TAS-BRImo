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
import edu.uksw.fti.pam.pam_activityintent.CatatanPengeluaranActivity
import edu.uksw.fti.pam.pam_activityintent.HomeActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun CatatanBaruPemasukanScreen() {
    var isian by remember { mutableStateOf("") }

    data class Item(
        val id: Int,
        val judul: String,
        val gambar: Int,
        val namabawah: String
    )

    val items = listOf(
        Item(
            1,
            stringResource(R.string.label_jumlah),
            R.drawable.tariktunai,
            "Rp "
        ),
        Item(
            2,
            stringResource(R.string.label_pilihkategori),
            R.drawable.lainnya,
            stringResource(R.string.label_kategori)
        ),
        Item(
            3,
            stringResource(R.string.label_tanggal),
            R.drawable.lainnya,
            stringResource(R.string.label_tanggal)
        ),
        Item(
            4,
            stringResource(R.string.label_pembayaran),
            R.drawable.transfer,
            stringResource(R.string.label_pilihpembayaran)
        ),
        Item(
            5,
            stringResource(R.string.label_catatan),
            R.drawable.keuangan,
            "Opsional"
        )

    )
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
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier
                    .width(170.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_income),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, CatatanPengeluaranActivity::class.java)
                    )
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier
                    .width(170.dp)
            ) {
                Text(
                    text = stringResource(R.string.label_expenses),
                    color = Color(0xFF878787),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                )
            }
        }
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(colorResource(id = R.color.white))
            ) {
                items(items) { item ->
                    Card(
                        backgroundColor = MaterialTheme.colors.background,
                        modifier = Modifier
                            .width(120.dp)
                            .height(100.dp)
                            .shadow(5.dp)
                            .padding(top = 3.dp)
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
                                    contentDescription = item.judul,
                                    modifier = Modifier
                                        .size(70.dp)
                                        .padding(top = 15.dp)
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 10.dp)
                                ) {
                                    Text(
                                        text = item.judul,
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                        modifier = Modifier
                                            .padding(top = 10.dp)
                                    )
                                    TextField(
                                        value = isian,
                                        label = { Text(item.namabawah, fontSize = 14.sp) },
                                        onValueChange = { isian = it },
                                        colors = TextFieldDefaults.textFieldColors(
                                            backgroundColor = Color.White
                                        )
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
                .padding(top = 10.dp)
                .fillMaxWidth(),
            onClick = {lContext.startActivity(
                Intent(lContext, HomeActivity::class.java)
            ) }) {
            Text(
                text = stringResource(R.string.label_simpan),
                color = Color(0xfff8fbff)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CatatanBaruPreview() {
    PAM_ActivityIntentTheme {
        CatatanBaruPemasukanScreen()
    }
}