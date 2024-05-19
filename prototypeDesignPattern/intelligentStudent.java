package prototypeDesignPattern;

public class intelligentStudent  extends student implements prototype {

    int iq;
    intelligentStudent(){
        
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public intelligentStudent getClone() {

        intelligentStudent st = new intelligentStudent();
        st.setBatch(this.getBatch());
        st.setBatchPsp(this.getBatchPsp());
        //st.setIq(140);
        return st;
    }

    


}
