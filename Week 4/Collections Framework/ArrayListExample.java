import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Liste des langages : " + list);
        
        // Accès par index
        System.out.println("Premier élément : " + list.get(0));
        
        // Itération
        for (String language : list) {
            System.out.println(language);
        }
    }
}
