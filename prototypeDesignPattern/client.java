package prototypeDesignPattern;

public class client {

    public static void main(String[] args) {
        
        student s = new student();
        s.setName("aadesh");
        s.setAge(29);
        s.setPsp(90);

        s.setBatchPsp(90);

        System.out.println(s.getPspFraction());


    }

}
