package com.example.s56419_lt1

import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun getUrl(view: View){
        val etUrl = findViewById<EditText>(R.id.etUrl)
        val webintent :Intent = Uri.parse(etUrl.toString()).let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
          }

    fun call(view: View) {
        val etCall = String.format("tel: %s",
                findViewById<EditText>(R.id.etPhone).toString())
        val dialIntent = Intent(Intent.ACTION_CALL)
        dialIntent.setData(Uri.parse(etCall));
        if (dialIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(dialIntent);
        } else {
            Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.");
        }
    }
         }}
