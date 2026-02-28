import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
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

// Renaming of user-defined variables
class UWF_NULL_FIELD_MUTANT {
    private String field;

    public void setField(String value) {
        field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String getField() {
        return field;
    }

    public static void main(String[] args) {
        UWF_NULL_FIELD_MUTANT uwf = new UWF_NULL_FIELD_MUTANT();
        uwf.setField("Hello World");
        System.out.println(uwf.getField());
    }
}