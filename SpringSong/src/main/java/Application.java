import model.Song;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Impl;
import service.SongService;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Impl.class);
        SongService songService = context.getBean(SongService.class);
        Song song = songService.get("1");
        System.out.println(song.getName());

    }
}
