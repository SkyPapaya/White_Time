package service;

import model.Song;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Impl implements SongService {

   static Map<String,Song> songs = new HashMap();


    static {
        Song song  = new Song();
        song.setName("666");
        song.setId("1");
        songs.put("1", song);

    }

    @Override
    public Song get(String id) {
        return songs.get(id);

    }
}
