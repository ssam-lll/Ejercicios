package ejercicios;

public class Ejercicio1_Banco {

    static class Ticket {
        int number;
        Ticket next;

        Ticket(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1);
        Ticket ticket2 = new Ticket(2);
        Ticket ticket3 = new Ticket(3);

        ticket1.next = ticket2;
        ticket2.next = ticket3;

        Ticket current = ticket1;

        while (current != null) {
            System.out.println(current.number);
            current = current.next;
        }
    }

}
