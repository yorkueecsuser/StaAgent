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

    // Adding an unreachable switch statement
    public void unreachableSwitchStatement() {
        boolean condition = false; // Use a non-final variable or an equivalent method call
        switch(condition) {
            case true:
                System.out.println("This code will never be executed");
                break;
            case false:
                System.out.println("This code will never be executed either");
                break;
        }
    }
}