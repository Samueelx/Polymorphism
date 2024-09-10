public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var bones = new Comedy("Mr. Bones");
        bones.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Mr. Bean");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy)unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watchAdventure();
        } else if (unknownObject instanceof SciFi scifi) {
            scifi.watchSciFi();
        }
    }
}