package ch07;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
  private String title;
  private String artist;
  private int bpm;
  TestDrive(String title, String artist, int bpm){
      this.title = title;
      this.artist = artist;
      this.bpm = bpm;
  }
  public String getTitle(){
      return title;
  }
  public String getArtist(){
      return artist;
  }
  public int getBpm(){
      return bpm;
  }
  public String toString(){
      return title;
  }
}

class MockSongs{
    public static List<String> getSongString(){
        List<String> songs = new ArrayList<>();
        songs.add("롤리폴리");
        songs.add("오솔길");
        songs.add("내 나이가 어때서");
        return songs;
    }
}