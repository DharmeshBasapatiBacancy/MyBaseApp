package com.example.mybaseapp.di

import com.example.mybaseapp.db.AppDatabase
import com.example.mybaseapp.network.services.ApiService
import com.example.mybaseapp.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMainRepository(apiService: ApiService, appDatabase: AppDatabase): MainRepository {
        return MainRepository(apiService, appDatabase)
    }

}