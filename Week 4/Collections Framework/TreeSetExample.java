import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);

        System.out.println("Éléments du TreeSet triés : " + treeSet);
        
        // Accéder au plus petit et au plus grand élément
        System.out.println("Premier élément : " + treeSet.first());
        System.out.println("Dernier élément : " + treeSet.last());
    }
}
