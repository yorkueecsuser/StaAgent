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

// Unreachable while loop mutation
class UWF_NULL_FIELD_Mutant {
    private String field;

    public void setField(String value) {
        field = null;
        while (false) {
            // Unreachable code
            System.out.println("Hello World");
        }
    }

    public String getField() {
        return field;
    }

    public static void main(String[] args) {
        UWF_NULL_FIELD_Mutant uwf = new UWF_NULL_FIELD_Mutant();
        uwf.setField("Hello World");
        System.out.println(uwf.getField());
    }
}