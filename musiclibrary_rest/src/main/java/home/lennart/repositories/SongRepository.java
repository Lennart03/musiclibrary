package home.lennart.repositories;

import home.lennart.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Repository
public interface SongRepository extends JpaRepository<Song, Integer > {
}
