package com.example.mybaseapp.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sampleTable")
data class TbSample(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var name: String,
    var hobbies: List<String>
)
