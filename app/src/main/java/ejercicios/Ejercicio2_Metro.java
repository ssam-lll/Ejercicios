package ejercicios;

public class Ejercicio2_Metro {

    static class Station {
        int street;
        Station next;

        Station(int street) {
            this.street = street;
        }
    }

    public static void main(String[] args) {
        Station station1 = new Station(67);
        Station station2 = new Station(118);
        Station station3 = new Station(5);

        station1.next = station2;
        station2.next = station3;

        Station current = station1;

        while (current != null) {
            System.out.println(current.street);
            current = current.next;
        }
    }

}
