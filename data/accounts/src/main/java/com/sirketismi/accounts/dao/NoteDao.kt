package com.sirketismi.accounts.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.sirketismi.common.NoteEntity

@Dao
interface NoteDao {

    /*@Query("SELECT * FROM NoteEntity")
    fun getAll(): List<NoteEntity>*/

    @Query("SELECT * FROM NoteEntity")
    fun getAll() : LiveData<List<NoteEntity>>

    @Query("SELECT * FROM NoteEntity")
    suspend fun getAllSync() : List<NoteEntity>

    @Query("SELECT * FROM NoteEntity where uid = :noteId")
    fun loadAllById(noteId : Int): LiveData<List<NoteEntity>>

    @Query("SELECT * FROM NoteEntity where uid IN (:noteIds)")
    fun loadAllByIds(noteIds : IntArray): LiveData<List<NoteEntity>>

    @Insert
    suspend fun insert(note : NoteEntity)

    @Delete
    fun delete(note : NoteEntity)

}