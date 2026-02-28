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

    // Mutant code: Unreachable if-else statement
    public void unreachableIfElseStatementMutant() {
        if (false) {
            // This branch is unreachable
            field = null;
        } else {
            // This branch is reachable
            field = "Hello World";
        }
    }
}