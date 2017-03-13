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
    public Artist addNewArtist(String artistName) {
        return artistRepository.save(new Artist(artistName));
    }

    @Override
    public Artist getArtist(String artistName) {
        return artistRepository.findByName(artistName);
    }

    @Override
    public Artist getArtist(Integer id) {
        return artistRepository.findOne(id);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
