import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void amptyMovieManager() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add_1_Movies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        String[] actual = manager.findAll();
        String[] expected = {"Film I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");
        manager.addMovie("Film QQ");
        String[] actual = manager.findAll();
        String[] expected = {"Film AA", "Film BB", "Film CC", "Film DD", "Film EE",
                "Film FF", "Film GG", "Film HH", "Film QQ" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");

        manager.addMovie("Film EE");

        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");
        manager.addMovie("Film QQ");

        String[] actual = manager.findLast();
        String[] expected = {"Film QQ", "Film HH"};
        Assertions.assertArrayEquals(expected, actual);
    }
// , "Film GG", "Film FF", "Film EE, , "Film DD", "Film CC", "Film BB, "Film AA"


}

