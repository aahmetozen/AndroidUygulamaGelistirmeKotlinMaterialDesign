package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.navigationbarkullanimi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.R

@Preview
@Composable
fun navigationbarsayfapreview(){
    navigationbarsayfa()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navigationbarsayfa(){
    val items = remember { mutableListOf("Bir","Iki") }
    val secilenitem= remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Baslik")})

        },
        bottomBar = {
            NavigationBar(containerColor = Color.Gray) {
                items.forEachIndexed { index, item -> NavigationBarItem(
                    selected = secilenitem.value==index,
                    onClick = { secilenitem.value=index },
                    label = { Text(text = item)},
                    icon = {
                        when(item){
                            "Bir" -> Icon(painter = painterResource(id = R.drawable.resim_bir),
                                contentDescription ="" )
                            "Iki" -> Icon(painter = painterResource(id = R.drawable.resim_iki),
                                contentDescription ="" )
                        }
                    }, colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Blue,
                        unselectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        indicatorColor = Color.Red
                    ))  }
            }
        }
    ){paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            if (secilenitem.value==0){
                sayfabir()
            }
            if (secilenitem.value==1){
                sayfaiki()
            }

        }

    }
}