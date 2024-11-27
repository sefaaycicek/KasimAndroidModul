package com.sirketismi.accounts.repository

import androidx.lifecycle.LiveData
import com.sirketismi.accounts.dao.NoteDao
import com.sirketismi.accounts.db.AppDatabase
import com.sirketismi.common.NoteEntity
import javax.inject.Inject

interface INoteRepository {
    fun getAll() : LiveData<List<NoteEntity>>
    suspend fun getAllSync() : List<NoteEntity>
    suspend fun insert(note : NoteEntity)
}

class NoteRepository @Inject constructor(private val noteDao: NoteDao) : INoteRepository {
    override fun getAll() : LiveData<List<NoteEntity>> {
        return noteDao.getAll()
    }

    override suspend fun insert(note: NoteEntity) {
        noteDao.insert(note)
    }

    override suspend fun getAllSync(): List<NoteEntity> {
        return noteDao.getAllSync()
    }


}
