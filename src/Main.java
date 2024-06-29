// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Directory dir=new Directory("Movies");
      Directory suspenseMovies=new Directory("Suspense Movies");
      Directory horrorMovies=new Directory("Horror Movies");
      suspenseMovies.dirList.add(new File("Clockwork Orange"));
      suspenseMovies.dirList.add(new File("Eyes Wide Shut"));
      horrorMovies.dirList.add(new File("Psycho"));
      horrorMovies.dirList.add(new File("Beau is Afraid"));
      dir.dirList.add(suspenseMovies);
      dir.dirList.add(horrorMovies);
      dir.ls();
    }
}