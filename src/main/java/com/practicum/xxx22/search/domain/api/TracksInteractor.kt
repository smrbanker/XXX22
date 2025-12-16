package com.practicum.xxx22.search.domain.api

import com.practicum.xxx22.search.domain.Track
import kotlinx.coroutines.flow.Flow

interface TracksInteractor {
    fun searchTracks(text: String, text2: String): Flow<Pair<List<Track>?, String?>>
}