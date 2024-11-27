package com.sirketismi.accounts.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sirketismi.accounts.dao.NoteDao
import com.sirketismi.common.NoteEntity
import com.sirketismi.common.UserEntity

@Database(entities = [NoteEntity::class, UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao() : NoteDao
}