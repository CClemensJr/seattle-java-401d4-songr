package com.super_famicom_coder.songr.controllers;

import com.super_famicom_coder.songr.models.Album;
import com.super_famicom_coder.songr.models.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
    public String showAlbumForm() {
        return "addAlbum";
    }


    @PostMapping("/add-album")
    public String newAlbum(@Valid Album a, BindingResult r, Model m) {
        if (r.hasErrors()) return "addAlbum";

        albumRepository.save(a);

        m.addAttribute(("albums", albumRepository.findAll()));

        return "allAlbums";
    }
}
