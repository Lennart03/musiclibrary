package home.lennart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LVDBB73 on 17/02/2017.
 */
@Controller
public class AlbumController {

    @RequestMapping("/albums")
    public String albumsHomePage() {
        return "albums";
    }
}
