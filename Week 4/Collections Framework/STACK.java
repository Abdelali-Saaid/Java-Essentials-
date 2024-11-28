import java.util.*;
public class STACK{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Soumyadip");
        stack.push("Println");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}