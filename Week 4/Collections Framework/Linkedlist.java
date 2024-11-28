import java.util.*;
public class Linkedlist {
    public static void main(String args[]){
        LinkedList<String> al = new LinkedList<String>();
        al.add("Soumyadip");
        al.add("Codewith007");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
