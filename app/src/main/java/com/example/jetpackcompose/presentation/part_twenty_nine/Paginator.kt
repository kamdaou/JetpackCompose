package com.example.jetpackcompose.presentation.part_twenty_nine

interface Paginator<Item, Key> {
    suspend fun loadNextItems()

    fun reset()
}