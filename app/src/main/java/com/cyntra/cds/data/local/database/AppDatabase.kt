package com.cyntra.cds.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cyntra.cds.data.local.database.dao.UserDao
import com.cyntra.cds.data.local.database.entities.UserEntity

@Database(entities = [UserEntity::class],
version=1, exportSchema = true
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getWorldDao(): UserDao
}