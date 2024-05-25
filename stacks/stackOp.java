package stacks;
import java.util.*;

public class stackOp {

    static Stack<Integer> s1 = new Stack<>();

    public static void pushData(int data){
        s1.push(data);
    }

    public static void getData(){
        System.out.println( s1.peek() );
    }
    

    public static void main(String[] args) {

        // Stack<Integer> s1 = new Stack<>();
        // s1.push(2);
        
        // System.out.println(s1.peek());

        stackOp.pushData(45);
        stackOp.getData();
        
    }

}
