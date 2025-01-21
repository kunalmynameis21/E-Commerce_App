package com.example.e_commerceapp

data class CartsModel(
    val date: String?=null,
    val id: Int?=null,
    val userId: Int?=null
)
data class LoginModel(
    val username : String?=null,
    val password : String?=null,

)
data class LoginResponse(
    val tokeng:String?=null
)