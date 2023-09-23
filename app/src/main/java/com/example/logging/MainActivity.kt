package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    private lateinit var myEditText : EditText
    private lateinit var buttonLog : Button
    private lateinit var buttonTimber : Button

    //константа
    private val myTag : String = "From EditText"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())

        setContentView(R.layout.activity_main)

        myEditText = findViewById(R.id.editText)
        buttonLog = findViewById(R.id.button_log)
        buttonTimber = findViewById(R.id.button_timber)

        buttonLog.setOnClickListener { sendLog() }
        buttonTimber.setOnClickListener  { sendTimber() }
      }

      private fun sendTimber (){
          Timber.d(myEditText.text.toString())
      }
        private fun sendLog() {
            Log.v(myTag, myEditText.text.toString())
        }
    }