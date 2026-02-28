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

// Mutation Operator: Unreachable switch statement
// Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.

class UWF_NULL_FIELD_Mutant {
    private String field;

    public void setField(String value) {
        field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        switch (false) {
            case false:
                // unreachable code
                field = "Mutant";
                break;
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