package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.DrawerKullanimi

import android.annotation.SuppressLint
import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.R
import kotlinx.coroutines.launch

@Preview
@Composable
fun drawersayfapreview(){
    drawersayfa()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun drawersayfa(){
    val items = remember { mutableListOf("Bir","Iki") }
    val secilenitem= remember { mutableStateOf(0) }
    val drawerState= rememberDrawerState(DrawerValue.Closed) // drawerin durumunu takip etmek icin
    val scope= rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState=drawerState,
        drawerContent = {
           ModalDrawerSheet(drawerContentColor = Color.LightGray) {
               items.forEachIndexed { index, item ->
                   NavigationDrawerItem(label = { Text(text = item)  },
                       icon = { when(item){
                           "Bir" -> Icon(painter = painterResource(id = R.drawable.resim_bir),
                               contentDescription ="" )
                           "Iki" -> Icon(painter = painterResource(id = R.drawable.resim_iki),
                               contentDescription ="" )
                       }},
                       selected = secilenitem.value==index,
                       onClick = {
                           secilenitem.value=index
                           scope.launch { drawerState.close() }
                       },
                       colors = NavigationDrawerItemDefaults.colors(
                           selectedIconColor = Color.Blue,
                           unselectedIconColor = Color.Gray,
                           unselectedTextColor = Color.Black,
                           selectedTextColor = Color.White
                       )
                   )
               }
           }
        },
        content = {
            if (secilenitem.value==0){
                sayfa_bir()
            }
            if (secilenitem.value==1){
                sayfa_iki()
            }
        }
    )
      val activity=(LocalContext.current as Activity)

        BackHandler(onBack = {
            if (drawerState.isOpen){
                scope.launch { drawerState.close() }
            }else{
                activity.finish()
            }
        })



}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navigationbarsayfa(){
    val items = remember { mutableListOf("Bir","Iki") }
    val secilenitem= remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Baslik") })

        },
        bottomBar = {
            NavigationBar(containerColor = Color.Gray) {
                items.forEachIndexed { index, item -> NavigationBarItem(
                    selected = secilenitem.value==index,
                    onClick = { secilenitem.value=index },
                    label = { Text(text = item) },
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
                sayfa_bir()
            }
            if (secilenitem.value==1){
                sayfa_iki()
            }

        }

    }
}