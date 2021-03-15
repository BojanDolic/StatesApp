package com.dolic.statesapp.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "drzave")
public class Drzava {

    @PrimaryKey
    public int d_id;

    @ColumnInfo(name = "Drzave")
    public String imeDrzave;

    @ColumnInfo(name = "Number")
    public String brojTelefona;
}
