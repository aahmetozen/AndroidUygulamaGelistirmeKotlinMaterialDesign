package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun cardkullanimipreview(){
    cardkullanimi()
}
@Composable
fun cardkullanimi(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center) {
        Card(modifier = Modifier
            .padding(all = 10.dp)
            .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            ),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp,Color.Magenta)
        ) {

            Row(horizontalArrangement = Arrangement.Center,
                modifier = Modifier.clickable {}.fillMaxWidth()) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(all = 10.dp)) {
                    Image(painter = painterResource(id = R.drawable.gunes_resim), 
                        contentDescription ="" )
                    Text(text = "Gunes", color = Color.White, fontSize = 36.sp)
                }
            }
        }

    }
}