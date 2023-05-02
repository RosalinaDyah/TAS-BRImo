package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import edu.uksw.fti.pam.pam_activityintent.*
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun Lainnya() {
    val lContext = LocalContext.current
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .verticalScroll(state = scrollState)
            .background(colorResource(id = R.color.white))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.white))
                .padding(20.dp)
//            .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = stringResource(R.string.label_fav),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xff1763ce))
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp, start = 30.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.transfer),
                contentDescription = "transfer",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.briva),
                contentDescription = "briva",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.listrik),
                contentDescription = "listrik",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.pulsa),
                contentDescription = "pulsa",
                modifier = Modifier
                    .size(50.dp)
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp, start = 30.dp, end = 30.dp)
        ) {
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, TarikTunaiActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, BrivaActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, ListrikActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, PulsaActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 160.dp, start = 30.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.briva),
                contentDescription = "brizzi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.tariktunai),
                contentDescription = "trktunai",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.wallet),
                contentDescription = "dompet",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.putihh),
                contentDescription = "kosongan",
                modifier = Modifier
                    .size(50.dp)
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 160.dp, start = 30.dp, end = 115.dp)
        ){
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, BrizziActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, TransferActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, DompetDigitalActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 125.dp, start = 15.dp, end = 45.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_tarik),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_briva),
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(end = 13.dp)
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_electricity),
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(end = 25.dp)
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_pulsa),
                fontSize = 12.sp,
                color = Color.Black,
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 215.dp, start = 40.dp, end = 108.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_brizzi),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_transfer),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_dompet),
                fontSize = 12.sp,
                color = Color.Black,
            )
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 250.dp, start = 20.dp, end = 20.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_transfercash),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xff1763ce))
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 300.dp, start = 30.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.tariktunai),
                contentDescription = "mutasi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.keuangan),
                contentDescription = "keuangan",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.mutasi),
                contentDescription = "mutasi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.transfer),
                contentDescription = "keuangan",
                modifier = Modifier
                    .size(50.dp)
            )
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 300.dp, start = 30.dp, end = 30.dp)
        ){
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, TransferActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, SetorTunaiActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, TarikTunaiActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, TransferActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }


        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 355.dp, start = 25.dp, end = 40.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_qr),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_deposit),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_tarik),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_transfer),
                fontSize = 12.sp,
                color = Color.Black,
            )

        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 390.dp, start = 30.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.listrik),
                contentDescription = "mutasi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.wallet),
                contentDescription = "keuangan",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.putihh),
                contentDescription = "kosongan",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.putihh),
                contentDescription = "kosongan",
                modifier = Modifier
                    .size(50.dp)
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 390.dp, start = 30.dp, end = 200.dp)
        ){
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, ValasActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, InternasionalActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 450.dp, start = 22.dp, end = 190.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_forex),
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(end = 3.dp)
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_international),
                fontSize = 12.sp,
                color = Color.Black,
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 485.dp, start = 20.dp, end = 20.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_financial_statements),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xff1763ce))
            )
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 535.dp, start = 30.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.mutasi),
                contentDescription = "mutasi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.keuangan),
                contentDescription = "keuangan",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.putihh),
                contentDescription = "kosongan",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.putihh),
                contentDescription = "kosongan",
                modifier = Modifier
                    .size(50.dp)
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 535.dp, start = 30.dp, end = 200.dp)
        ) {
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, ArtikelActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, CatatanPemasukanActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 595.dp, start = 30.dp, end = 190.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_mutation),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_financial),
                fontSize = 12.sp,
                color = Color.Black,
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 635.dp, start = 20.dp, end = 20.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_topup),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xff1763ce))
            )
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 680.dp, start = 35.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.brizzi),
                contentDescription = "mutasi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.pulsa),
                contentDescription = "keuangan",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.tariktunai),
                contentDescription = "mutasi",
                modifier = Modifier
                    .size(50.dp)
            )
            Image(
                painter = painterResource(R.drawable.wallet),
                contentDescription = "keuangan",
                modifier = Modifier
                    .size(50.dp)
            )
        }

        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 680.dp, start = 35.dp, end = 30.dp)
        ) {
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, BrizziActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, PulsaActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                            Intent(lContext, StreamingActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
            TextButton(
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, DompetDigitalActivity::class.java)
                    )
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                shape = RoundedCornerShape(180.dp)
            ) {
                Text(
                    text = " ",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 735.dp, start = 40.dp, end = 20.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_brizzi),
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(end = 25.dp)
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_pulsa),
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(end = 25.dp)
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_streaming),
                fontSize = 12.sp,
                color = Color.Black,
            )
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.label_dompet),
                fontSize = 12.sp,
                color = Color.Black,
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LainnyaPreview() {
    PAM_ActivityIntentTheme {
        Lainnya()
    }
}