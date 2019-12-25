package com.test.model

data class UserRequest(val name: String?, val job:String?)
data class UserResponse (val name: String, val job:String, val id:String, val createdAt:String)