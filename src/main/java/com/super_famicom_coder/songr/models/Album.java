package com.super_famicom_coder.songr.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @NotBlank(message = "An album title is required")
    String title;

    @NotBlank(message = "An artist is required")
    String artist;

    @NotNull(message = "A song count is required")
    int songCount;

    @NotNull(message = "A length is required")
    int length;

    @NotBlank(message = "An image source url is required")
    String imageUrl;

    public Album() {}

    public Album(String title, String artist, int songCount, int length, String imageUrl) {

        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
}
