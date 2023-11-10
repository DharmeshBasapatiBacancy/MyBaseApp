package com.example.mybaseapp.repository

import com.example.mybaseapp.db.AppDatabase
import com.example.mybaseapp.network.services.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService, private val appDatabase: AppDatabase) {
}