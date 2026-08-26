package ejercicios;

public class Ejercicio5_Cine {
    static class Movie {
        String name;
        Movie next;

        Movie(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Movie1");
        Movie movie2 = new Movie("Movie2");
        Movie movie3 = new Movie("Movie3");

        movie1.next = movie2;
        movie2.next = movie3;

        Movie current = movie1;
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }
}
