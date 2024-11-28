import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Client 1");
        queue.add("Client 2");
        queue.add("Client 3");

        System.out.println("Éléments de la file : " + queue);
        
        // Traiter le premier client
        System.out.println("Traiter : " + queue.poll());
        System.out.println("File après traitement : " + queue);
    }
}
