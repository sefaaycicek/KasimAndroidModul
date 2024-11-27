package com.sirketismi.accounts.di

import com.sirketismi.accounts.dao.NoteDao
import com.sirketismi.accounts.db.AppDatabase
import com.sirketismi.accounts.repository.INoteRepository
import com.sirketismi.accounts.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)

abstract class RepositoryModule {
    /*@Singleton
    @Provides
    fun provideNoteDao(noteDao: NoteDao): NoteRepository {
        return NoteRepository(noteDao)
    }*/

    @Binds
    abstract fun bindRepository(imlp: NoteRepository): INoteRepository
}