package com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.TopAppBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.materialdesign.R

@Preview
@Composable
fun toppappbarkullpreview(){
    toppappbarkull()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun toppappbarkull(){
    Scaffold (
        topBar = {
            TopAppBar(
                title = ({ Column {
                    Text(text = "Baslik")
                    Text(text = "Alt Baslik", fontSize = 13.sp)

                }}),
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.anaRenk),
                    titleContentColor = Color.White
                )
            )
        }
    ){paddingValues -> Column(modifier = Modifier.padding(paddingValues)){

    }



    }
}