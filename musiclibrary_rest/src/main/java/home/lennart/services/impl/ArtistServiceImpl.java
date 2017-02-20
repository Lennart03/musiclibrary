package home.lennart.services.impl;

import home.lennart.entity.Artist;
import home.lennart.repositories.ArtistRepository;
import home.lennart.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void addNewArtist(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public Artist getArtist(String artistName) {
        return artistRepository.findByName(artistName);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
