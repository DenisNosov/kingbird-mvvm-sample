package ru.kingbird.mvvmsampleapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kingbird.mvvmsampleapp.R

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}