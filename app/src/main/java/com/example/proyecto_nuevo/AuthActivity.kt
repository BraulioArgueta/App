package com.example.proyecto_nuevo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class AuthActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {


        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

    val analytics= FirebaseAnalytics.getInstance(this)
    val bundle=Bundle()
        bundle.putString("message","Integracion de Firebase completa")
        analytics.logEvent("InitScreen", bundle)



    }



}