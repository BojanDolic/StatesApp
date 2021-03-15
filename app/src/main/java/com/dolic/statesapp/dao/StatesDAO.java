package com.dolic.statesapp.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.dolic.statesapp.entities.Drzava;

import java.util.List;

@Dao
public interface StatesDAO {

    @Query("SELECT * FROM drzave_table")
    public List<Drzava> getDrzave();

}
