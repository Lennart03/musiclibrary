package home.lennart.controllers;

import home.lennart.dto.ArtistDTO;
import home.lennart.entity.Artist;
import home.lennart.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@CrossOrigin
@RestController
@RequestMapping(produces = "application/json")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @RequestMapping(method = RequestMethod.GET, value = "/artist")
    public List<Artist> artists() {
        return artistService.getAllArtists();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/artist/{artistName}")
    public Artist createArtist(@PathVariable  String artistName) {
        return artistService.addNewArtist(artistName);
    }

}
