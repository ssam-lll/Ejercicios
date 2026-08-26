package ejercicios;

public class Ejercicio3_Tareas {

    static class Task {
        String description;
        Task next;

        Task(String description) {
            this.description = description;
        }
    }

    public static void main(String[] args) {
        Task task1 = new Task("taks1");
        Task task2 = new Task("taks2");
        Task task3 = new Task("taks3");

        task1.next = task2;
        task2.next = task3;

        Task current = task1;

        while (current != null) {
            System.out.println(current.description);
            current = current.next;
        }
    }

}
