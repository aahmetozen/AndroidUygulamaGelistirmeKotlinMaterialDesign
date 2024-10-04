package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LC_sabitlistelemepreview(){
    LC_sabitlisteleme()
}
@Composable
fun LC_sabitlisteleme(){
    LazyColumn {
        item { 
            Card(modifier = Modifier
                .padding(all = 5.dp)
                .fillMaxWidth()) {
                Row(modifier = Modifier.clickable { }) {
                    Row(modifier = Modifier.padding(all=10.dp)
                        ,verticalAlignment = Alignment.CenterVertically) {
                        Image(painter = painterResource(id = R.drawable.gunes_resim24), contentDescription ="" )
                        Text(text = "Gunes",modifier = Modifier.padding(all=5.dp))
                    }
                }

                
            }
        }

        item {
            Card(modifier = Modifier
                .padding(all = 5.dp)
                .fillMaxWidth()) {
                Row(modifier = Modifier.clickable { }) {
                    Row(modifier = Modifier.padding(all=10.dp)
                        ,verticalAlignment = Alignment.CenterVertically) {
                        Image(painter = painterResource(id = R.drawable.ay_resim), contentDescription ="" )
                        Text(text = "Ay",modifier = Modifier.padding(all=5.dp))
                    }
                }


            }
        }
    }
}