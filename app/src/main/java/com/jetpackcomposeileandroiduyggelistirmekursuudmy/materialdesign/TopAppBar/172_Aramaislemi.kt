package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.TopAppBar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.R

@Preview
@Composable
fun toppappbararamapreview(){
    toppappbararama()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun toppappbararama(){
    val menuaciliskontrol= remember { mutableStateOf(false) }
    val aramayapiliyormu= remember { mutableStateOf(false) }
    val tf= remember { mutableStateOf("") }
    Scaffold (
        topBar = {
            TopAppBar(
                title = ({ Column {

                    if (aramayapiliyormu.value){
                        TextField(modifier = Modifier.size(80.dp), value = tf.value,
                            onValueChange = {
                                tf.value=it
                            }, label = { Text(text = "Ara")},
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color.Transparent,
                                focusedIndicatorColor = Color.White,
                                unfocusedLabelColor = Color.White,
                                focusedTextColor = Color.Black
                            ))
                    }else{
                        Text(text = "Baslik")
                        Text(text = "Alt Baslik", fontSize = 13.sp)
                    }

                }
                }),
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.anaRenk),
                    titleContentColor = Color.White
                ),
                actions = {
                    Text(text = "Cikis", modifier = Modifier.clickable { })
                    IconButton(onClick = {menuaciliskontrol.value=true }) {
                        Icon(painter = painterResource(id = R.drawable.info_resim),
                            contentDescription = "")
                    }

                    if (aramayapiliyormu.value){
                        IconButton(onClick = {
                            aramayapiliyormu.value=false
                            tf.value=""}) {
                            Icon(painter = painterResource(id = R.drawable.kapat_resim),
                                contentDescription = "")
                        }

                    }else{
                        IconButton(onClick = {
                            aramayapiliyormu.value=true}) {
                            Icon(painter = painterResource(id = R.drawable.arama_resim),
                                contentDescription = "")
                        }

                    }

                    DropdownMenu(expanded = menuaciliskontrol.value, onDismissRequest = { menuaciliskontrol.value=false }) {
                        DropdownMenuItem(text = { Text(text = "Sil") }, onClick = { menuaciliskontrol.value=false })
                        DropdownMenuItem(text = { Text(text = "Guncelle") }, onClick = { menuaciliskontrol.value=false })
                    }

                }
            )
        }
    ){paddingValues -> Column(modifier = Modifier.padding(paddingValues)){

    }
    }
}