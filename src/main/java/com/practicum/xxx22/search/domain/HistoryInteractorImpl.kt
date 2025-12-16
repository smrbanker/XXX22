package com.practicum.xxx22.search.domain

import com.practicum.xxx22.search.data.HistoryRepository

class HistoryInteractorImpl(private val repository : HistoryRepository) : HistoryInteractor {

    override fun trackWrite(historyListID: MutableList<Track>) {
        return repository.trackWrite(historyListID)
    }
    override fun trackClear() {
        return repository.trackClear()
    }
    override fun trackRead(): Array<Track> {
        return repository.trackRead()
    }
}