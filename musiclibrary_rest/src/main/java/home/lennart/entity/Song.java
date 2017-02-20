package home.lennart.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Entity
public class Song extends AbstractEntity {

    @OneToMany
    private List<Artist> artists;

    private int trackNumber;
    private String title;
    private int nMinutes;
    private int nSeconds;

    public Song() {
        artists = new ArrayList<>();
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getnMinutes() {
        return nMinutes;
    }

    public void setnMinutes(int nMinutes) {
        this.nMinutes = nMinutes;
    }

    public int getnSeconds() {
        return nSeconds;
    }

    public void setnSeconds(int nSeconds) {
        this.nSeconds = nSeconds;
    }
}
