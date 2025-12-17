package com.practicum.xxx22.media.ui.track

import com.practicum.xxx22.search.domain.Track

sealed interface MediaStateTrack {

    data class Content(
        val tracks: List<Track>
    ) : MediaStateTrack

    data class Empty(
        val message: String
    ) : MediaStateTrack
}