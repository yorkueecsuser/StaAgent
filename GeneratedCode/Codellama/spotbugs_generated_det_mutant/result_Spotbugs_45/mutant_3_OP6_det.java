import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        for  (int ekeefltb = 0; ekeefltb < 0; ekeefltb++) {int wswpgllb = 69131364;}
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