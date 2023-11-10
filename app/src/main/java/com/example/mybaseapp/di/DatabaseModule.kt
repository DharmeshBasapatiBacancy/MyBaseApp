package com.example.mybaseapp.di

import android.content.Context
import androidx.room.Room
import com.example.mybaseapp.db.AppDatabase
import com.example.mybaseapp.db.AppDatabase.Companion.MIGRATION_1_2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(appContext, AppDatabase::class.java, "")
            .addMigrations(MIGRATION_1_2).build()
    }

}