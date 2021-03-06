package com.example.pra2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movies")

public class Movie {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "movieId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "movieTitle")
    private String mTitle;

    public Movie(@Nullable String title, String strikingScene, int score, String creationDate) {
        mTitle = title;
        mStrikingScene = strikingScene;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getStrikingScene() {
        return mStrikingScene;
    }

    public void setStrikingScene(String strikingScene) {
        mStrikingScene = strikingScene;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private String mStrikingScene;
    private int mScore;
    private String mCreationDate;

}
