package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LC_dinamiklistelemepreview(){
    LC_dinamiklisteleme()
}
@Composable
fun LC_dinamiklisteleme(){
    val ulkelistesi= remember {mutableStateListOf("Turkiye","Japonya","Almanya","Italya") }
    LazyColumn {
        items(
            count = ulkelistesi.count(), // bize sayiyi getircek
            itemContent = {
                val ulke=ulkelistesi[it]

                Card(modifier = Modifier
                    .padding(all = 5.dp)
                    .fillMaxWidth()) {
                    Row {// tiklama islemini yapabilmek icin
                        Row(verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(all = 10.dp)) {
                            Text(text = ulke,modifier = Modifier.padding(all = 5.dp))

                        }
                    }
                }
            }
        )
    }
}