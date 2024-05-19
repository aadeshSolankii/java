package prototypeDesignPattern;

public class client {


    static void registerPrototype( String batch, int batchPsp, int isIntelligentStudent ){

        if (isIntelligentStudent == 0) {
            student st = new student();
            st.setBatch(batch);
            st.setBatchPsp(batchPsp);
            studentRegistry.registerStudentPrototype(batch, st);            
        }
        else{
            //System.out.println("here");
            student st = new intelligentStudent();
            st.setBatch(batch);
            st.setBatchPsp(batchPsp);
            studentRegistry.registerStudentPrototype(batch, st); 

        }
        
    }
    public static void main(String[] args) {
        
        registerPrototype("APR 24", 90, 0);

        student newSt = studentRegistry.getStudentPrototype("APR 24").getClone();
        newSt.setAge(29);
        newSt.setName("iron-man");

        student newSt2 = studentRegistry.getStudentPrototype("APR 24").getClone();
        newSt2.setAge(29);
        newSt2.setName("spider-man");

        System.out.println("DEBUG-001");

        registerPrototype("MAR 24", 95, 1);

        student newIn1 =  studentRegistry.getStudentPrototype("MAR 24").getClone();
        newIn1.setAge(34);
        newIn1.setName("captain-america");

        student newIn2 =  studentRegistry.getStudentPrototype("MAR 24").getClone();

        System.out.println("DEBUG-002");


    }

}
