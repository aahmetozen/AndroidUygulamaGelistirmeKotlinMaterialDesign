package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.TopAppBar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.sp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.R

@Preview
@Composable
fun toppappbarmenupreview(){
    toppappbarmenu()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun toppappbarmenu(){
    val menuaciliskontrol= remember { mutableStateOf(false) }
    Scaffold (
        topBar = {
            TopAppBar(
                title = ({ Column {
                    Text(text = "Baslik")
                    Text(text = "Alt Baslik", fontSize = 13.sp)

                }
                }),
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.anaRenk),
                    titleContentColor = Color.White
                ),
                actions = {
                    Text(text = "Cikis", modifier = Modifier.clickable { })
                    IconButton(onClick = { }) {
                        Icon(painter = painterResource(id = R.drawable.info_resim),
                            contentDescription = "")
                    }
                    IconButton(onClick = { menuaciliskontrol.value=true}) {
                        Icon(painter = painterResource(id = R.drawable.more_resim),
                            contentDescription = "")
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