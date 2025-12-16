package com.practicum.xxx22.media.domain.db

import com.practicum.xxx22.search.domain.Track
import kotlinx.coroutines.flow.Flow

interface FavouriteRepository {
    fun getFavouriteTracks(): Flow<List<Track>>
    fun getFavouriteTracksID(): Flow<List<Int>>
    suspend fun addFavouriteTrack(track: Track)
    suspend fun deleteFavouriteTrack(track: Track)
}