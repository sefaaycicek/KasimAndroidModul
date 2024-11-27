package com.sirketismi.common

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteEntity(
    @PrimaryKey(autoGenerate = true) val uid : Int = 0,
    @ColumnInfo(name = "title") val title : String?,
    @ColumnInfo(name = "detail") val detail : String?,
    @ColumnInfo(name = "note_date") val noteDate : Long,
    @ColumnInfo(name = "is_active") val isActive : Boolean,
    @ColumnInfo(name = "is_delete") val isDelete : Boolean) {
}