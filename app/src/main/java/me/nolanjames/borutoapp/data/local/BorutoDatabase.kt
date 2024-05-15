package me.nolanjames.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import me.nolanjames.borutoapp.data.local.dao.HeroDao
import me.nolanjames.borutoapp.data.local.dao.HeroRemoteKeyDao
import me.nolanjames.borutoapp.domain.model.Hero
import me.nolanjames.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}