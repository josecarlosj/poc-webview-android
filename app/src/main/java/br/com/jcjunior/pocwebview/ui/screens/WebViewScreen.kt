package br.com.jcjunior.pocwebview.ui.screens

import android.content.Context
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebViewScreen(
    context: Context,
    modifier: Modifier = Modifier
) {
    val webview = WebView(context).apply {
        this.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        settings.apply {
            javaScriptEnabled = true
            cacheMode = WebSettings.LOAD_DEFAULT
            domStorageEnabled = true
            databaseEnabled = true
        }

        loadUrl("")
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "WebView Content")
                },
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        AndroidView(
            factory = { webview },
            modifier = Modifier.padding(innerPadding)
        )
    }
}