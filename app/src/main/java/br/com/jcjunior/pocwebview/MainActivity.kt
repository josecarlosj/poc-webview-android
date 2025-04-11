package br.com.jcjunior.pocwebview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.jcjunior.pocwebview.ui.screens.WebViewScreen
import br.com.jcjunior.pocwebview.ui.theme.POCWebViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            POCWebViewTheme {
                WebViewScreen(
                    context = this
                )
            }
        }
    }
}