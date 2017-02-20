package home.lennart.controllers;

import home.lennart.dto.ArtistDTO;
import home.lennart.entity.Artist;
import home.lennart.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Controller
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @RequestMapping("/artists")
    public String artistsHomePage() {
        return "artists";
    }

    @ModelAttribute("allArtists")
    public List<Artist> populateArtists() {
        return this.artistService.getAllArtists();
    }

    @PostMapping("/searchArtist")
    public Artist getArtist(@ModelAttribute ArtistDTO artistDTO) {
        return artistService.getArtist(artistDTO.getName());
    }

}
