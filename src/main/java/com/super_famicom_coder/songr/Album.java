package com.super_famicom_coder.songr;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Album {
/**********
 * Instance variables
 * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "album")
    private List<Song> songs;

    @NotBlank(message = "An album title is required")
    private String title;

    @NotBlank(message = "An artist is required")
    private String artist;

    @NotNull(message = "A song count is required")
    private int songCount;

    @NotNull(message = "A length is required")
    private int length;

    @NotBlank(message = "An image source url is required")
    private String imageUrl;


/**********
 * Constructors
 * */
    public Album() {}

    public Album(String title, String artist, int songCount, int length, String imageUrl) {

        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }


/**********
 * Instance Methods
 * */
    public void setSongs(Song song) { this.songs.add(song); }

    public String getTitle() { return this.title; }
    public String getArtist() { return this.artist; }
    public List getSongs() { return this.songs; }
    public int getSongCount() { return this.songCount; }
    public int getLength() { return (this.length) * 60; }
    public String getImageURl() { return this.imageUrl; }

}
