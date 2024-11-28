import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("Éléments de la file de priorité : " + priorityQueue);
        
        // Accéder à l'élément de la plus haute priorité
        System.out.println("Plus haute priorité : " + priorityQueue.peek());
        
        // Supprimer l'élément de la plus haute priorité
        priorityQueue.poll();
        System.out.println("Après suppression : " + priorityQueue);
    }
}
