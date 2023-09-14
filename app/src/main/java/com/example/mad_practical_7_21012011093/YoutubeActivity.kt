package com.example.mad_practical_7_21012011093

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.MediaController
import android.widget.VideoView

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val youtubeId = "fjn9B64Znrk"
        val mywebview: WebView = findViewById(R.id.webview)
        val webSettings: WebSettings = mywebview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort= true
        mywebview.loadUrl("http://www.youtube.com/enbed/$youtubeId")


    }
}