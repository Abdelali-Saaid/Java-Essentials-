import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");  // Dupliqué, sera ignoré

        System.out.println("Éléments du HashSet : " + hashSet);
    }
}
