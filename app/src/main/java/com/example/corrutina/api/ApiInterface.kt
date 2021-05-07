package com.example.corrutina.api

import com.example.corrutina.models.DogsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiInterface {
    @GET
    suspend fun getDogs(@Url url: String): Response<DogsResponse>
}