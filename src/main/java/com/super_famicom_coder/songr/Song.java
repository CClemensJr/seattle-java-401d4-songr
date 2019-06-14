package com.super_famicom_coder.songr;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Album album;

    @NotBlank(message = "An album title is required")
    private String title;

    @NotNull(message = "A length is required")
    private int length;

    @NotNull(message = "A track number is required")
    private int trackNumber;


}
