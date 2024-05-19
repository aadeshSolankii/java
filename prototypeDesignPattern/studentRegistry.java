package prototypeDesignPattern;

import java.util.HashMap;

public class studentRegistry {

    static HashMap <String, student > map = new HashMap<>();

    
    static void registerStudentPrototype(String batch,student st){
        map.put(batch, st);
    }

    static student getStudentPrototype( String batch ) throws NullPointerException {
        return map.get(batch);   
        
    }

}
