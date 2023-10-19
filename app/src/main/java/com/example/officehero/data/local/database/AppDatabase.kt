package com.example.officehero.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.officehero.data.local.database.dao.UserDao
import com.example.officehero.data.local.database.entities.UserEntity

@Database(entities = [UserEntity::class],
version=1, exportSchema = true
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getWorldDao(): UserDao
}