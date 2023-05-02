package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.JalurTarikTunaiActivity
import edu.uksw.fti.pam.pam_activityintent.KonfirmasiAtmActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme


@Composable
fun AtmScreen(){
    val lContext = LocalContext.current

    data class Item(val id: Int, val name: String)

    val items = listOf(
        Item(1, "Rp100.000"),
        Item(2, "Rp200.000"),
        Item(3, "Rp300.000"),
        Item(4, "Rp400.000"),
        Item(5, "Rp500.000"),
        Item(6, "Rp600.000"),
        Item(7, "Rp700.000"),
        Item(8, "Rp800.000"),
        Item(9, "Rp900.000"),
        Item(10, "Rp1.000.000"),
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = stringResource(R.string.label_tarik),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
    Text(
        text = stringResource(R.string.label_SumbDan),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color(0xff1763ce),
        modifier = Modifier
            .padding( top = 60.dp, start = 20.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            //.background(colorResource(id = R.color.white))
            .padding(20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 70.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(colorResource(id = R.color.white), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 180.dp)
    ){
        TextButton(
            onClick = {
                lContext.startActivity(
                    Intent(lContext, JalurTarikTunaiActivity::class.java)
                )
            },
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = " ",
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 35.dp, end = 30.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.r),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 105.dp)
                .size(45.dp)
        )
    }
    Text(
        text = "3214 5674 1234 092",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = Color.Black,
        modifier = Modifier
            .padding( top = 100.dp, start = 100.dp, end = 20.dp)
    )
    Text(
        text = "Rp.1.000.000,00",
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF878787),
        modifier = Modifier
            .padding( top = 125.dp, start = 100.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 150.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(colorResource(id = R.color.white), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 35.dp, end = 30.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.atm),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 180.dp)
                .size(45.dp)
        )
    }
    Text(
        text =stringResource(R.string.label_JalurTar),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF878787),
        modifier = Modifier
            .padding( top = 180.dp, start = 100.dp)
    )
    Text(
        text = "ATM",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = Color.Black,
        modifier = Modifier
            .padding( top = 205.dp, start = 100.dp, end = 20.dp)
    )
    Text(
        text = stringResource(R.string.label_Pilnom),
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = Color(0xff1763ce),
        modifier = Modifier
            .padding( top = 265.dp, start = 20.dp)
    )

    LazyVerticalGrid(columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = 300.dp, start = 20.dp, end = 20.dp)
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
    ){
        items(items){ item ->
            Card(
                backgroundColor = MaterialTheme.colors.background,
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .padding(8.dp)
                    .shadow(20.dp)
            ){
                Text(
                    text = item.name,
                    color = Color.Black,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
    Column(
        modifier = Modifier
            .padding(end = 25.dp, top = 300.dp)
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(top = 350.dp, start = 20.dp)
                .fillMaxWidth(),
            onClick = { lContext.startActivity(
                Intent(lContext, KonfirmasiAtmActivity::class.java)
            )
            }) {
            Text(
                text = stringResource(R.string.label_Lanjutkan),
                color = Color(0xfff8fbff)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AtmPreview() {
    PAM_ActivityIntentTheme {
        AtmScreen()
    }
}