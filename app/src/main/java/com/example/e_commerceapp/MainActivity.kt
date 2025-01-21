package com.example.e_commerceapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val signBtn=findViewById<Button>(R.id.Signbtn)
        val enterName=findViewById<EditText>(R.id.Entername)
        val enterPassword=findViewById<EditText>(R.id.Userpassword)

        signBtn.setOnClickListener{
            val editUserid=enterName.text.toString()
            val editPassword=enterPassword.text.toString()



            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://fakestoreapi.com/auth/")
                .build().create(ApiServiesInterface::class.java)
                .postcarts(LoginModel(editUserid.toString(),editPassword.toString()))
            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "token : - ${it.tokeng}", Toast.LENGTH_SHORT).show()
                }





        }





        }
    }
