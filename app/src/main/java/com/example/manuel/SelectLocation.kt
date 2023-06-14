package com.example.manuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class SelectLocation : AppCompatActivity() {

    lateinit var web1:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_location)

        web1 = findViewById(R.id.web1)

        web1.webViewClient = WebViewClient()
        web1.loadUrl("https://www.google.com/maps")
        web1.settings.javaScriptEnabled = true
        web1.settings.setSupportZoom(true)
    }
}