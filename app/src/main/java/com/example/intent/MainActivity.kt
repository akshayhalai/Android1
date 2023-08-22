package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var alert :  Button
    lateinit var toast :  Button
    lateinit var snackbar :  Button
    lateinit var intent :  Button

    lateinit var insta : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alert = findViewById(R.id.alert)
        toast = findViewById(R.id.toast)
        snackbar = findViewById(R.id.snackbar)
        intent = findViewById(R.id.intent)
        val url : Button = findViewById<Button>(R.id.url)
        alert.setOnClickListener()
        {
            customAlertBox()
        }

        toast.setOnClickListener()
        {
            customToast()
        }

        snackbar.setOnClickListener()
        {
            //custom()
        }

        intent.setOnClickListener()
        {
            customIntent()
        }
        url.setOnClickListener()
        {
            customUrl()
        }
    }

    fun customAlertBox()
    {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to ext??")
        builder.setTitle("Alert!!")
        builder.setCancelable(false)
        builder.setPositiveButton("Yes")
        { dialog, which ->
            finish()
            Toast.makeText(this,"You press Yes ...", Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton("No")
        { dialog, which ->
            dialog.cancel()
            Toast.makeText(this,"You press No ...", Toast.LENGTH_SHORT).show()

        }
        builder.create().show()
    }

    fun customIntent()
    {

        val intent = Intent(this,avtivity2::class.java)
        startActivity(intent)

    }

    fun customToast()
    {
        Toast.makeText(this,"You Press Toast...", Toast.LENGTH_SHORT).show()
    }
    fun customUrl()
    {
        val intent = Intent(this,PassDataActivity3::class.java)
        startActivity(intent)
    }




}

