package home.lennart.services;

import home.lennart.entity.Artist;

import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
public interface ArtistService {

    void addNewArtist(Artist artist);

    Artist getArtist(String artistName);

    List<Artist> getAllArtists();

}
