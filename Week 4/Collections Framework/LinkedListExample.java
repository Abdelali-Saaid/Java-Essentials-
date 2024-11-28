import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Paris");
        linkedList.add("New York");
        linkedList.add("Tokyo");

        System.out.println("Liste des villes : " + linkedList);
        
        // Ajouter en tête et en queue
        linkedList.addFirst("Londres");
        linkedList.addLast("Berlin");
        System.out.println("Après ajout : " + linkedList);
    }
}
