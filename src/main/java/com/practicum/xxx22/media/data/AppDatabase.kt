package com.practicum.xxx22.media.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.practicum.xxx22.media.data.db.dao.PlaylistDao
import com.practicum.xxx22.media.data.db.dao.TrackDao
import com.practicum.xxx22.media.data.db.dao.TrackListDao
import com.practicum.xxx22.media.data.db.entity.PlaylistEntity
import com.practicum.xxx22.media.data.db.entity.TrackEntity
import com.practicum.xxx22.media.data.db.entity.TrackListEntity

@Database(version = 102, entities = [TrackEntity::class, PlaylistEntity::class, TrackListEntity::class])
abstract class AppDatabase : RoomDatabase(){
    abstract fun trackDao(): TrackDao
    abstract fun playlistDao() : PlaylistDao
    abstract fun tracklistDao() : TrackListDao
}