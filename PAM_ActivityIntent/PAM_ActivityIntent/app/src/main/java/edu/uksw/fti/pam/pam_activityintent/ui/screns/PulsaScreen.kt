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
import edu.uksw.fti.pam.pam_activityintent.KonfirmasiPulsaActivity
import edu.uksw.fti.pam.pam_activityintent.PaketDataActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.RekeningActivity
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun PulsaScreen() {
    val lContext = LocalContext.current
    data class Item(val idd: Int, val namee : String)

    val items = listOf(
        Item(1, "Rp 25.000"),
        Item(2, "Rp 50.000"),
        Item(3, "Rp 100.000"),
        Item(4, "Rp 250.000"),
        Item(5, "Rp 500.000"),
        Item(6, "Rp 1.000.000"),

        )

    var nomorhp by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
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
                text = stringResource(R.string.label_last_purchase),
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
                                color = Color.Black,
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .padding(top = 20.dp, start = 20.dp)
                                    .fillMaxWidth()
                            )
                            TextField(
                                value = nomorhp,
                                placeholder = { Text(stringResource(R.string.label_nomortujuan),
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(start = 5.dp)) },
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
                            },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                            modifier = Modifier
                                .width(170.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.label_pulsa),
                                textAlign = TextAlign.Center,
                                color = Color.White,
                                fontSize = 14.sp
                            )
                        }
                        Button(
                            onClick = {
                                lContext.startActivity(
                                    Intent(lContext, PaketDataActivity::class.java)
                                )
                            },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                            modifier = Modifier
                                .width(170.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.label_paketdata),
                                color = Color(0xFF878787),
                                textAlign = TextAlign.Center,
                                fontSize = 14.sp,
                            )
                        }
                    }
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier
                            .padding(5.dp)
                            .background(colorResource(id = R.color.white))
                    ) {
                        items(items) { item ->
                            Card(
                                backgroundColor = MaterialTheme.colors.background,
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(50.dp)
                                    .padding(8.dp)
                                    .shadow(5.dp)
                            ) {
                                Text(
                                    textAlign = TextAlign.Center,
                                    text = item.namee,
                                    color = Color.Black,
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(top = 8.dp)
                                )
                            }
                        }
                    }
                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .fillMaxWidth(),
                        onClick = {
                            lContext.startActivity(
                                Intent(lContext, KonfirmasiPulsaActivity::class.java)
                            )
                        }) {
                        Text(
                            text = stringResource(R.string.label_beli),
                            color = Color(0xfff8fbff)
                        )
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PulsaPreview() {
    PAM_ActivityIntentTheme {
        PulsaScreen()
    }
}