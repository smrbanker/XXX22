package com.practicum.xxx22.media.ui.playlist

import com.practicum.xxx22.search.domain.Playlist

sealed interface MediaStatePlaylist {

    data class Content(
        val playlist: List<Playlist>
    ) : MediaStatePlaylist

    data class Empty(
        val message: String
    ) : MediaStatePlaylist
}
