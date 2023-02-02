import java.util.ArrayList;
import java.util.List;

public class Enums {

    public static void main(String[] args) {
        Film[] films = Film.values();


//            System.out.println(film.getNumber());
//            System.out.println(film.name());
//            System.out.println(film.getGenre());
        System.out.println(Film.getByNumber(2));
        System.out.println(Film.getAllByGenre("Comedy"));

    }

    private enum Film {
        RUSH_HOUR_3(1, "Comedy"),
        LEON(2, "Drama"),
        RESIDENT_EVIL(3, "Horror"),
        HOME_ALONE(4, "Comedy");

        private final int number;
        private final String genre;

        Film(int number, String genre) {
            this.number = number;
            this.genre = genre;
        }

        public int getNumber() {
            return number;
        }

        public String getGenre() {
            return genre;
        }

        /**
         * If the number of the film is equal to the number passed in, return the film, otherwise return null.
         *
         * @param number The number of the film.
         * @return The film object with the number that was passed in.
         */
        public static Film getByNumber(int number) {
            for(Film film: Film.values()) {
                if(film.getNumber()==number)
                    return film;
            }
            return null;
        }

        public static Film getByIndex(int index) {
            return Film.values()[index];
        }

        /**
         * Return a list of all films that have the given genre.
         *
         * @param genre The genre of the film.
         * @return A list of films that have the same genre as the one passed in.
         */
        public static List<Film> getAllByGenre(String genre) {
            List<Film> filmList = new ArrayList<>();
            for(Film film: Film.values()) {
                if(film.getGenre().equals(genre))
                    filmList.add(film);
            }
            return filmList;
        }

        @Override
        public String toString() {
            return this.number + " " + this.name() + " " + this.genre;
        }
    }
}
