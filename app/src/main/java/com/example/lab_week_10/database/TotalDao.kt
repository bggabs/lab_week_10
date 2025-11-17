package com.example.lab_week_10.database

import androidx.room.*

@Dao
interface TotalDao {

    @Query("SELECT * FROM total WHERE id = :id")
    fun getTotal(id: Long): List<Total>

    @Insert
    fun insert(total: Total)

    @Update
    fun update(total: Total)
}
