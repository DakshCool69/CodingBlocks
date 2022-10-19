package com.jap.songPlaylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Song> playlist = new ArrayList<> ();
        int songIndexNumber = 0;
        boolean flag = true;
        while (flag) {
            System.out.println ("1. Add a song to playlist. ");
            System.out.println ("2. Display Number of Songs in playlist.");
            System.out.println ("3. Play Previous Song.");
            System.out.println ("4. Play Next Song.");
            System.out.println ("5. Display Songs");
            System.out.print ("Enter your Choice: ");
            int choice = scanner.nextInt ();
            switch (choice) {
                case 1:
                    System.out.println ("\n\nAdd a song to playlist");
                    System.out.print ("Enter Song Name: ");
                    String songName = scanner.next ();
                    System.out.print ("Enter Song Duration: ");
                    String songDuration = scanner.next ();
                    playlist.add (0, new Song (songName, songDuration));
                    System.out.println ("\n\n");
                    break;
                case 2:
                    System.out.println ("\n\nRemove a song to playlist");
                    int index = 1;
                    for (Song song : playlist) {
                        System.out.format ("%d. ", index++);
                        System.out.print (song.toString () + "\n");
                    }
                    System.out.print ("Enter Song Number: ");
                    int songIndex = scanner.nextInt ();
                    playlist.remove (songIndex - 1);
                    System.out.println ("\n\n");
                    break;
                case 3:
                    System.out.println ("\n\nPlay Previous Song.");
                    if (songIndexNumber - 1 < playlist.size ()) System.out.println (playlist.get (++songIndexNumber));
                    else {
                        songIndexNumber = 0;
                        System.out.println (playlist.get (++songIndexNumber));
                    }
                    System.out.println ("\n\n");
                    break;
                case 4:
                    System.out.println ("Play Previous Song.");
                    if (songIndexNumber != 0) {
                        System.out.println (playlist.get (--songIndexNumber));
                    } else System.out.println (playlist.get (songIndexNumber));
                    break;
                case 5:
                    System.out.println ("\nSongs in playlist");
                    System.out.println ("-------------------------------------------------");
                    int i = 1;
                    for (Song song : playlist) {
                        System.out.format ("%d. ", i++);
                        System.out.print (song.toString () + "\n");
                    }
                    System.out.println ("\n\n");
                    break;
                default:
                    System.out.println ("Unexpected value: " + choice);
                    System.out.println ("Exiting ... ");
                    flag = false;
            }
        }
    }
}
