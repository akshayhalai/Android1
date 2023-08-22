package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class PassDataActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_data3)

        val myweb = findViewById<WebView>(R.id.MyWebView)

        myweb.webViewClient = WebViewClient()
        myweb.apply {
        loadUrl("https://www.instagram.com/")
            settings.javaScriptEnabled = true
        }
    }
}