package com.sirketismi.kasimandroidmodul

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sirketismi.accounts.repository.INoteRepository
import com.sirketismi.common.NoteEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val noteRepository: INoteRepository) : ViewModel() {

    var noteList = MutableLiveData<List<NoteEntity>>()
    var showLoadingProgreess = MutableLiveData<Boolean>(false)
    var reloadTable = MutableLiveData<Boolean>(false)
    var showMessage = MutableLiveData<String>("")

    fun prepareData() {
        viewModelScope.launch {
            val noteEntity = NoteEntity(title = "selam", detail = "selam", noteDate = System.currentTimeMillis(), isActive = true, isDelete = false)
            noteRepository.insert(noteEntity)
        }
    }

    fun getList() {
        showLoadingProgreess.postValue(true)
        viewModelScope.launch {
            val list =  noteRepository.getAllSync()
            noteList.postValue(list)
            showLoadingProgreess.postValue(false)
        }
    }
}