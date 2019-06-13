package com.super_famicom_coder.songr.models;

import javax.persistence.Entity;

@Entity
public class Album {
    protected long id;
    protected String title;
    protected String artist;
    protected int songCount;
    protected int songLength;
    protected String imageUrl;
}
