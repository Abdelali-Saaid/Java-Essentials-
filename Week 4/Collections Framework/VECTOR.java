import java.util.*;
public class VECTOR {
    public static void main(String args[]){
        Vector<String> v = new Vector<String>();
        v.add("Soumyadip");
        v.add("Java");
        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
