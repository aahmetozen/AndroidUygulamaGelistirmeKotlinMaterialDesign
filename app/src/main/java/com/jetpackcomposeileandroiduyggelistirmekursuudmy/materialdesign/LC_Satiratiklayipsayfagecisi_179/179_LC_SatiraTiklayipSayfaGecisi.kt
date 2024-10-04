package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.LC_Satiratiklayipsayfagecisi_179

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun sayfagecisleri(){
val navController= rememberNavController()
    NavHost(navController = navController, startDestination = "LC_satiratiklayipsayfagecisi") {
        composable("LC_satiratiklayipsayfagecisi"){
            LC_satiratiklayipsayfagecisi(navController = navController)
        }
        composable("detay_sayfa/{ulkeAdi}", arguments = listOf(
            navArgument("ulkeAdi"){NavType.StringType}
        )){
            val ulkeAdi=it.arguments?.getString("ulkeAdi")!!
            DetaySayfa(navController=navController,ulkeAdi)

        }
    }
}

@Preview
@Composable
fun LC_satiratiklayipsayfagecisipreview(){
    sayfagecisleri()
}
@Composable
fun LC_satiratiklayipsayfagecisi(navController: NavController){
    val ulkelistesi= remember { mutableStateListOf("Turkiye","Japonya","Almanya","Italya") }
    LazyColumn {
        items(
            count = ulkelistesi.count(), // bize sayiyi getircek
            itemContent = {
                val ulke=ulkelistesi[it]

                Card(modifier = Modifier
                    .padding(all = 5.dp)
                    .fillMaxWidth()) {
                    Row(modifier = Modifier.clickable {
                        Log.e("Liste","$ulke secildi.")
                        navController.navigate("detay_sayfa/$ulke")
                    }) {// tiklama islemini yapabilmek icin
                        Row(verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .padding(all = 10.dp)
                                .fillMaxWidth()) {
                            Text(text = ulke,modifier = Modifier
                                .padding(all = 5.dp)
                                .clickable {
                                    Log.e("Liste", "Text ile $ulke secildi.")
                                    navController.navigate("detay_sayfa/$ulke")
                                })
                            OutlinedButton(onClick = {
                                Log.e("Liste","button ile $ulke secildi.")
                            }) {
                                Text(text = "Ulke Sec")

                            }
                        }
                    }
                }
            }
        )
    }
}
