package ejercicios;

public class Ejercicio4_Hospital {

    static class Patient {
        String name;
        Patient next;

        Patient(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("asd");
        Patient patient2 = new Patient("fgsdfgs");
        Patient patient3 = new Patient("qweqw");

        patient1.next = patient2;
        patient2.next = patient3;

        Patient current = patient1;

        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }

}
