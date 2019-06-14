package com.super_famicom_coder.songr;

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


    @GetMapping("/albums/new")
    public String showAlbumForm() {
        return "albumForm";
    }


//    @PostMapping("/albums")
//    public RedirectView addAlbum(@RequestParam String title,
//                                 @RequestParam String artist,
//                                 @RequestParam int songCount,
//                                 @RequestParam int length,
//                                 @RequestParam String imageUrl) {
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
