package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

data class Itemm(val id: Int, val namestream: String, val imageResstream: Int)

val itemstream = listOf(
    Itemm(1, "Item 1", R.drawable.molatv),
    Itemm(2, "Item 2", R.drawable.wetv),
    Itemm(3, "Item 3", R.drawable.video),
)

@Composable
fun Streaming() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(colorResource(id = R.color.white))
//            .verticalScroll(rememberScrollState())
    ) {
        Card(
            elevation = 10.dp,
            backgroundColor = (Color(0xff1763ce)),
            shape = RoundedCornerShape(size = 5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)

        ){
            Text(
                text = stringResource(R.string.label_streaming),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()

        ) {
            items(itemstream) { item ->
                Card(
                    backgroundColor = MaterialTheme.colors.background,
                    modifier = Modifier
                        .width(100.dp)
                        .height(200.dp)
                        .padding(8.dp)
                        .shadow(20.dp)
                ) {
                    Card() {
                        Image(
                            painter = painterResource(item.imageResstream),
                            contentDescription = item.namestream,

                            )
                    }

                }
            }
        }

    }

}


@Preview(showBackground = true)
@Composable
fun MyLazyGridPreview() {
    PAM_ActivityIntentTheme {
        Streaming()
    }
}