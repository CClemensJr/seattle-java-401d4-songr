package com.super_famicom_coder.songr.controllers;

import com.super_famicom_coder.songr.models.Album;
import com.super_famicom_coder.songr.models.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String showAllAlbums(Model m) {
        Iterable<Album> albums = albumRepository.findAll();

        m.addAttribute("albums", albums);

        return "allAlbums";
    }

    @GetMapping("/add-album")
    public String addAlbum() {
        return "addAlbum";
    }
}
