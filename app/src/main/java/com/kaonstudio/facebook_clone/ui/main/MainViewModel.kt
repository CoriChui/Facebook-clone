package com.kaonstudio.facebook_clone.ui.main

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.kaonstudio.facebook_clone.ui.main.home.components.FeedListItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
) : ViewModel() {
    private val _items: MutableState<List<FeedListItem>> = mutableStateOf(emptyList())
    val items: State<List<FeedListItem>> = _items
    private val data = listOf(
        FeedListItem.First,
        FeedListItem.Second,
        FeedListItem.Third,
        FeedListItem.Fourth,
        FeedListItem.Fifth,
    )

    init {
        _items.value = data
    }
}