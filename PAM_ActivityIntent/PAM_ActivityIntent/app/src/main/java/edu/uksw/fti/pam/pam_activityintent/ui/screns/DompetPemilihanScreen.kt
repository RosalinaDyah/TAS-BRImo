package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.PinDompetActivity
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun DompetPemilihanScreen(){
    val lContext = LocalContext.current

    var nomorhp by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = stringResource(R.string.label_dompetdigital),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 20.dp, end = 20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(
                    Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
//                .border(
//                    BorderStroke(2.dp, Color(0xFFE5E5E5))
//                )
        )

    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 35.dp, end = 30.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.wallet),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 110.dp)
                .size(45.dp)
        )
    }
    Text(
        text = stringResource(R.string.label_dompetdigital),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF878787),
        modifier = Modifier
            .padding(top = 130.dp, start = 100.dp)
    )
    Text(
        text = stringResource(R.string.label_pilihdompetdigital),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color.Black,
        modifier = Modifier
            .padding(top = 105.dp, start = 100.dp)
    )

    Text(
        text = "v",
        fontWeight = FontWeight.Bold,
        fontSize = 23.sp,
        color = Color(0xff1763ce),
        modifier = Modifier
            .padding( top = 110.dp, start = 310.dp, end = 20.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 160.dp, start = 20.dp, end = 20.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(
                    Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
//                .border(
//                    BorderStroke(2.dp, Color(0xFFE5E5E5))
//                )
        )

    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 35.dp, end = 30.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.idcard),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 185.dp)
                .size(45.dp)
        )
    }


    Text(
        text = stringResource(R.string.label_nomorhandphone),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF878787),
        modifier = Modifier
            .padding(top = 185.dp, start = 100.dp)
    )
    TextField(
        value = nomorhp,
        placeholder = { Text(text = stringResource(R.string.label_nomortujuan),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Black,
//            modifier = Modifier
//                .padding(start = 5.dp)
        ) },
        onValueChange = { nomorhp = it },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White
        ),
        singleLine = false,
        modifier = Modifier .padding(top = 200.dp, start = 85.dp)
    )
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 660.dp, start = 20.dp, end=20.dp),
        onClick =
        {
            lContext.startActivity(
                Intent(lContext, PinDompetActivity::class.java)
            )
        }) {
        Text(
            text = stringResource(R.string.label_lanjutkan),
            color = Color(0xfff8fbff)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DompetPemilihanPreview() {
    PAM_ActivityIntentTheme {
        DompetPemilihanScreen()
    }
}