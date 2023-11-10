package com.example.mybaseapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.mybaseapp.db.converters.SampleTypeConverter
import com.example.mybaseapp.db.dao.SampleDao
import com.example.mybaseapp.db.entities.TbSample

@Database(entities = [TbSample::class], version = 1)
@TypeConverters(SampleTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun sampleDao(): SampleDao

    companion object {
        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE sampleTable ADD COLUMN age INTEGER DEFAULT 0 NOT NULL")
            }
        }
    }

}