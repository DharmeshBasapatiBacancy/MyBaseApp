package com.example.mybaseapp.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mybaseapp.db.entities.TbSample

@Dao
interface SampleDao {

    @Query("SELECT * FROM sampleTable")
    fun getAllSamples() : LiveData<List<TbSample>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(sample: TbSample) : Long

    @Delete
    suspend fun delete(sample: TbSample)

    @Query("DELETE FROM sampleTable")
    suspend fun deleteAllSamples()

    @Update
    suspend fun updateSample(sample: TbSample)

}