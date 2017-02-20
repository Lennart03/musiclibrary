package home.lennart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Entity
public class Artist extends AbstractEntity{

    @Column(unique = true)
    private String name;

    @OneToMany
    private List<Album> albums;

    public Artist() {
        albums = new ArrayList<>();
    }

    public Artist(String name) {
        this.name = name;
        albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }


}
