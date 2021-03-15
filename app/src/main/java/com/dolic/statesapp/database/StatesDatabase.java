package com.dolic.statesapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.dolic.statesapp.dao.StatesDAO;
import com.dolic.statesapp.entities.Drzava;

@Database(entities = Drzava.class, version = 3, exportSchema = false)
public abstract class StatesDatabase extends RoomDatabase {

    public abstract StatesDAO statesDao();

    private static volatile StatesDatabase INSTANCE;

    public static StatesDatabase getInstance(Context context) {
        if(INSTANCE == null) {
            synchronized (StatesDatabase.class) {
                if(INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            StatesDatabase.class,
                            "baza_drzava"
                    ).createFromAsset("drzave.db")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }

            }
        }
        return INSTANCE;
    }

}
