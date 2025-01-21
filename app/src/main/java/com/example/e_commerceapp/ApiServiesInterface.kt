package com.example.e_commerceapp

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiesInterface {

    @POST("login")
    fun postcarts(@Body loginModel: LoginModel): Observable<LoginResponse>
}