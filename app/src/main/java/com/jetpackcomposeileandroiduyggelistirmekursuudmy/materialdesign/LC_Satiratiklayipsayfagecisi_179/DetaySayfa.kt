package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.LC_Satiratiklayipsayfagecisi_179

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetaySayfa(navController: NavController,ulkeAdi:String){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = ulkeAdi, fontSize = 50.sp)
        
    }
}