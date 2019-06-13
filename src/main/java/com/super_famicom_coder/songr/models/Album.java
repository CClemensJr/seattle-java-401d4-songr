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
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @NotBlank(message = "An album title is required")
    protected String title;

    @NotBlank(message = "An artist is required")
    protected String artist;

    @NotNull(message = "A song count is required")
    protected int songCount;

    @NotNull(message = "A length is required")
    protected int length;

    @NotBlank(message = "An image source url is required")
    protected String imageUrl;
}
