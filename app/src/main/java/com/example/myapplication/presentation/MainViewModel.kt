package com.example.myapplication.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.GetUsefulActivityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getUsefulActivityUseCase: GetUsefulActivityUseCase) : ViewModel() {

    private val _state = MutableStateFlow(getUsefulActivityUseCase)
    val state = _state.asStateFlow()


    fun reloadUsefulActivity() {
        viewModelScope.launch {
            _state.emit(getUsefulActivityUseCase)
        }

    }
}