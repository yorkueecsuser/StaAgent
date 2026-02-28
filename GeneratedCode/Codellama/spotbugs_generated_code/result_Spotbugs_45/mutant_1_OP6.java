import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        for (int i = 0; false; i++) {
            System.out.println("Unreachable for loop");
        }
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