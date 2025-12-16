package com.practicum.xxx22.media.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.practicum.xxx22.media.data.db.dao.TrackDao
import com.practicum.xxx22.media.data.db.entity.TrackEntity

@Database(version = 100, entities = [TrackEntity::class])
abstract class AppDatabase : RoomDatabase(){
    abstract fun trackDao(): TrackDao
}