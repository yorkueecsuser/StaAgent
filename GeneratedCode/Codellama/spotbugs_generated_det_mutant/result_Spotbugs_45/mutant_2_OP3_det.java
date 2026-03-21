import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        if (true && false && false && true && true && true && true && true && false && false && false) {double qnieeuii = 151938545;}
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