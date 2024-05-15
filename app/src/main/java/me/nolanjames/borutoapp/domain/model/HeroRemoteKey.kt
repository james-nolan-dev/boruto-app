package me.nolanjames.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import me.nolanjames.borutoapp.util.Constants.HERO_REMOTE_KEY_TABLE_NAME

@Entity(tableName = HERO_REMOTE_KEY_TABLE_NAME)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?,
)
