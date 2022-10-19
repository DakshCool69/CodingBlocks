package com.jap.songPlaylist;

public class Song {
	private String nameOfSong;
    private String time;

    public Song(String nameOfSong, String time) {
        this.nameOfSong = nameOfSong;
        this.time = time;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getTime() {
        return String.valueOf (time);
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Song{" +
                "nameOfSong='" + nameOfSong + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
