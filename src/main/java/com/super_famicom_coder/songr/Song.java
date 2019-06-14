package com.super_famicom_coder.songr;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "Songs")
public class Song {
/**********
 * Instance variables
 * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private String album;

    @NotBlank(message = "An song title is required")
    private String title;

    @NotNull(message = "A length is required")
    private int length;

    @NotNull(message = "A track number is required")
    private int trackNumber;


/**********
 * Constructors
 * */
    public Song() {}

    public Song(String album, String title, int length, int trackNumber) {

        this.album = album;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }


/**********
 * Instance Methods
 * */
    public String getAlbum() { return this.album; }
    public String getTitle() { return this.title; }
    public int getLength() { return this.length; }
    public int getTrackNumber() { return this.trackNumber; }
}
