package com.test.config

enum class ApplicationConfig private constructor(val url: String){
	
	BASEURL("https://reqres.in/api/users")
}