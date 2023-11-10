package com.example.mybaseapp.network.services

import com.example.mybaseapp.network.models.SampleModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun fetchDataFromApi(
        @Query("country") countryCode: String = "in",
        @Query("page") pageNumber: Int = 1
    ): Response<SampleModel>

}