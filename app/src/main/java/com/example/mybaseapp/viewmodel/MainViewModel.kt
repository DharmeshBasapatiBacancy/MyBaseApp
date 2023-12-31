package com.example.mybaseapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mybaseapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository): ViewModel() {
}