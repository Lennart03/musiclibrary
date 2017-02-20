package home.lennart.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Entity
public class Album extends AbstractEntity {

    @ManyToOne
    private Artist artist;

    @OneToMany
    private List<Song> songs;

    public Album() {
        songs = new ArrayList<>();
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

}
