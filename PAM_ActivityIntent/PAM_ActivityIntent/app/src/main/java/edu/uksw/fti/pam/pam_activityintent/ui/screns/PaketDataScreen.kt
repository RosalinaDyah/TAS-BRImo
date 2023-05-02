package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import edu.uksw.fti.pam.pam_activityintent.PulsaActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme


@Composable
fun PaketDataScreen() {
//    val scrollState = rememberScrollState()
    val lContext = LocalContext.current

    data class Items(val id: Int, val name: String,val isi: String, val bayar: String)

    val itemss = listOf(
        Items(1, "Freedom U 1GB...", stringResource(R.string.label_freedom1gb), "Rp 30.000,00"),
        Items(2, "Freedom U 2GB...", stringResource(R.string.label_freedom2gb), "Rp 45.000,00"),
        Items(3, "Freedom U 3GB...", stringResource(R.string.label_freedom3gb), "Rp 65.000,00"),
        Items(4, "Freedom U 5GB...", stringResource(R.string.label_freedom5gb), "Rp 70.000,00"),
        Items(5, "Freedom U 7GB...", stringResource(R.string.label_freedom7gb),"Rp 85.000,00"),
        Items(6, "Freedom U 10G...", stringResource(R.string.label_freedom10gb),"Rp 100.000,00"),
        Items(7, "Freedom U 15G...", stringResource(R.string.label_freedom15gb), "Rp. 130.000,00"),
        Items(8, "Freedom U Jumbo", stringResource(R.string.label_freedomjumbo),"Rp. 150.000,00"),
        Items(9, "Freedom Comb...", stringResource(R.string.label_freedomcombo),"Rp 30.000,00"),
        Items(10, "Freedom Intern...", stringResource(R.string.label_freedominternet),"Rp 25.000,00"),

        )

    var nomorhp by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
//            .verticalScroll(state = scrollState)
            .background(colorResource(id = R.color.white))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(colorResource(id = R.color.white))
                .padding(20.dp)
    //            .verticalScroll(state = scrollState)
        ) {
            Text(
                text = stringResource(R.string.label_pulsadandata),
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
                    .fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.label_pembelianterakhir),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xff1763ce),
                    modifier = Modifier.padding(top = 15.dp)
                )

                Image(
                    painter = painterResource(R.drawable.indosat),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 25.dp, top = 15.dp)
                        .size(45.dp)
                )
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "Indosat Oor...",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 5.dp, start = 8.dp)
                    )
                    Text(
                        text = "089555123098",
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = Color(0xFF878787),
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Column(
                    ) {
                        Text(
                            text = stringResource(R.string.label_belipulsadandata),
                            color = Color(0xff1763ce),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 15.dp)
                        )
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.briva),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 20.dp)
                                    .size(50.dp)
                            )
                            Column(
                            ) {
                                Text(
                                    text = stringResource(R.string.label_nohp),
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(top = 20.dp, start = 20.dp)
                                        .fillMaxWidth()
                                )
                                TextField(
                                    value = nomorhp,
                                    placeholder = { Text(stringResource(R.string.label_nomortujuan)) },
                                    onValueChange = { nomorhp = it },
                                    colors = TextFieldDefaults.textFieldColors(
                                        backgroundColor = Color.White
                                    )
                                )
                            }
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceAround,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp)
                        ) {
                            Button(
                                onClick = {
                                    lContext.startActivity(
                                        Intent(lContext, PulsaActivity::class.java)
                                    )},
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                                modifier = Modifier
                                    .width(170.dp)
                            ) {
                                Text(
                                    text = stringResource(R.string.label_pulsa),
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
                                    text = stringResource(R.string.label_paketdata),
                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ){
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(1),
                            modifier = Modifier
                                .padding(5.dp)
                                .background(colorResource(id = R.color.white))
                        ) {
                            items(itemss) { item ->
                                Card(
                                    backgroundColor = MaterialTheme.colors.background,
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(110.dp)
                                        .padding(8.dp)
                                        .shadow(5.dp)
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .padding(start = 10.dp, top = 8.dp)
                                    ) {
                                        Text(
                                            text = item.name,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black,
                                            fontSize = 14.sp,
                                            modifier = Modifier
                                        )
                                        Text(
                                            text = item.isi,
                                            color = Color.Black,
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .padding(top = 3.dp, end = 25.dp)
                                        )
                                        Text(
                                            text = item.bayar,
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xff1763ce),
                                            fontSize = 16.sp,
                                            modifier = Modifier
                                                .padding(top = 5.dp)
                                            )
                                        }
                                    }
                                Button(
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(start = 5.dp, end = 5.dp, top = 97.dp)
                                        .fillMaxWidth(),
                                    onClick = {
                                        lContext.startActivity(
                                            Intent(lContext, KonfirmasiPaketDataActivity::class.java)
                                        )
                                    }) {
                                    Text(
                                        text = stringResource(R.string.label_beli),
                                        color = Color(0xff1763ce)
                                    )
                                }
                                }
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
fun PaketDataPreview() {
    PAM_ActivityIntentTheme {
        PaketDataScreen()
    }
}