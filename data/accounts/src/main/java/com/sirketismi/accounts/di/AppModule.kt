package com.sirketismi.accounts.di

import android.content.Context
import androidx.room.Room
import com.sirketismi.accounts.dao.NoteDao
import com.sirketismi.accounts.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    // NoteDao

    @Singleton
    @Provides
    fun provideNoteDao(appDatabase: AppDatabase): NoteDao {
        return appDatabase.noteDao()
    }


    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext applicationContext : Context) : AppDatabase {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "turkellEgitimDb"
        ).build()
        return db
    }
}