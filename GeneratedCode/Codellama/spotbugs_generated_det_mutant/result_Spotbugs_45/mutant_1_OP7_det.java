import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        boolean lfjjbfnu = false;while (lfjjbfnu && true && true && false && false && true && false && false && false && false && true && false) {double xscyhaiq = -677936523;}
        field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    
}

    public String getField() {
        return field;
    }

    public static void main(String[] args) {
        UWF_NULL_FIELD uwf = new UWF_NULL_FIELD();
        uwf.setField("Hello World");
        System.out.println(uwf.getField());
    }
}