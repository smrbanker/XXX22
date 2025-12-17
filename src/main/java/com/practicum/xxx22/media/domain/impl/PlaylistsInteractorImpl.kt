package com.practicum.xxx22.media.domain.impl

import com.practicum.xxx22.media.data.db.PlaylistsInteractor
import com.practicum.xxx22.media.data.db.PlaylistsRepository
import com.practicum.xxx22.search.domain.Playlist
import com.practicum.xxx22.search.domain.Track
import kotlinx.coroutines.flow.Flow

class PlaylistsInteractorImpl(private val playlistsRepository: PlaylistsRepository) :
    PlaylistsInteractor {

    override suspend fun addPlaylist(playlist: Playlist) {
        playlistsRepository.addPlaylist(playlist)
    }

    override fun getPlaylists(): Flow<List<Playlist>> {
        return playlistsRepository.getPlaylists()
    }

    override suspend fun addTrackToPlaylist(track: Track, playlist: Playlist) {
        playlistsRepository.addTrackToPlaylist(track, playlist)
    }
}