package test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * test
 */
public class test extends Thread {

    String a = new String("Aas");
    
    void printString(){
        System.out.println(a);
    }

    void read() throws IOException{
        System.out.println(this.isAlive());
        FileInputStream f = new FileInputStream("/home/aadesh/visualStudioWorkspace/java/sample.txt");
        
        int l;
        while( (l=f.read()) != -1) {
            System.out.print( (char)l );
            
        }
        
        System.out.println(this.getName());
        this.setName("nameUpdatedTo : object2");
        System.out.println(this.getName());
        System.out.println(this.isAlive());
        System.out.println(this.getPriority());
        
    }

{

}    public static void main(String args[]) throws IOException{

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("a");
        var a = new test();
        test a2 = new test();
        System.out.println("main thread : "+t.getName()+", test object thread : "+a.getName()+", a2 test object thread : "+a2.getName());
        a.setName("object01");
        System.out.println(a.getName());
        a.printString();
        a.read();
        System.out.println(a.getName());
        System.out.println(t.getName());


        
        

    }
}