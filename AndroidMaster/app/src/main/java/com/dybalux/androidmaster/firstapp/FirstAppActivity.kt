package com.dybalux.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dybalux.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
    }
}