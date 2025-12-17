package com.practicum.xxx22.media.data.db

import com.practicum.xxx22.search.domain.Playlist
import com.practicum.xxx22.search.domain.Track
import kotlinx.coroutines.flow.Flow

interface PlaylistsRepository {
    suspend fun addPlaylist(playlist: Playlist)
    fun getPlaylists(): Flow<List<Playlist>>
    suspend fun addTrackToPlaylist(track: Track, playlist: Playlist)
}