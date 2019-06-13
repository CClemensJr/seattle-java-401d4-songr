package com.super_famicom_coder.songr.controllers;

import com.super_famicom_coder.songr.models.Album;
import com.super_famicom_coder.songr.models.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

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


    @GetMapping("/albums/new")
    public String showAlbumForm() {
        return "albumForm";
    }


//    @PostMapping("/albums")
//    public RedirectView addAlbum(@RequestParam String title,
//                                 @RequestParam String artist,
//                                 @RequestParam int songCount,
//                                 @RequestParam int length) {
//        if (r.hasErrors()) return new RedirectView("/albums");
//
//        Album album = new Album(title, artist, songCount, length);
//
//        albumRepository.save(album);
//
//        m.addAttribute(("albums", albumRepository.findAll()))
//
//
//        return new RedirectView("/albums");
//    }
}
