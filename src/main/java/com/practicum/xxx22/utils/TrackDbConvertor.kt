package com.practicum.xxx22.utils

import com.practicum.xxx22.media.data.db.entity.TrackEntity
import com.practicum.xxx22.search.domain.Track

class TrackDbConvertor {

    fun map(track: Track): TrackEntity {
        return TrackEntity(track.trackId, track.trackName, track.artistName, track.trackTime, track.artworkUrl100, track.collectionName, track.releaseDate, track.primaryGenreName, track.country, track.previewUrl)
    }

    fun map(track: TrackEntity): Track {
        return Track(track.trackId, track.trackName, track.artistName, track.trackTime, track.artworkUrl100, track.collectionName, track.releaseDate, track.primaryGenreName, track.country, track.previewUrl)
    }
}