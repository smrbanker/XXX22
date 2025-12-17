package com.practicum.xxx22.utils

import com.practicum.xxx22.media.data.db.entity.PlaylistEntity
import com.practicum.xxx22.search.domain.Playlist

class PlaylistDbConvertor {

    fun map(playlist: Playlist): PlaylistEntity {
        return PlaylistEntity(
            playlistId = playlist.playlistId!!,
            playlistName = playlist.playlistName,
            playlistDescription = playlist.playlistDescription,
            playlistImage = playlist.playlistImage,
            playlistList = playlist.playlistList,
            playlistCount = playlist.playlistCount
        )
    }

    fun map(playlist: PlaylistEntity): Playlist {
        return Playlist(
            playlistId = playlist.playlistId,
            playlistName = playlist.playlistName,
            playlistDescription = playlist.playlistDescription,
            playlistImage = playlist.playlistImage,
            playlistList = playlist.playlistList,
            playlistCount = playlist.playlistCount
        )
    }
}