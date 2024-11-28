import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Éléments du vecteur : " + vector);
        
        // Supprimer un élément
        vector.remove(1);
        System.out.println("Après suppression : " + vector);
    }
}
