package prototypeDesignPattern;

public class client {


    static void registerPrototype( String batch, int batchPsp ){

        student st = new student();
        st.setBatch(batch);
        st.setBatchPsp(batchPsp);
        studentRegistry.registerStudentPrototype(batch, st);
    }
    public static void main(String[] args) {
        
        registerPrototype("APR 24", 90);

        student newSt = studentRegistry.getStudentPrototype("APR 24").getClone();
        newSt.setAge(29);
        newSt.setName("aadesh");

        student newSt2 = studentRegistry.getStudentPrototype("APR 24").getClone();
        newSt2.setAge(29);
        newSt2.setName("riya");

        System.out.println("DEBUG");


    }

}
