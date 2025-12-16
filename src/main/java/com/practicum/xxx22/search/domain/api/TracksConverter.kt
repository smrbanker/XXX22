package com.practicum.xxx22.search.domain.api

import com.practicum.xxx22.search.data.dto.TrackDto
import com.practicum.xxx22.search.domain.Track

interface TracksConverter {
    fun trackConvertToDto(track: Track): TrackDto
    fun trackConvertFromDto(track: TrackDto): Track
    fun listConvertToDto(tracks: List<Track>): List<TrackDto>
    fun listConvertFromDto(tracks: List<TrackDto>): List<Track>
}