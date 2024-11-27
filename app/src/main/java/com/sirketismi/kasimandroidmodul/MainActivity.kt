package com.sirketismi.kasimandroidmodul

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.AnyRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val viewModel : MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.noteList.observe(this) { items ->
             println(items)
        }

        viewModel.showLoadingProgreess.observe(this) { isLoading ->
            if(isLoading) {

            }
        }

        viewModel.prepareData()
        viewModel.getList()

        //viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }
}