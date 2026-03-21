class FieldMethodNameConflict {

    private String data; // BUG: AvoidFieldNameMatchingMethodName

    // Constructor to initialize the field
    public FieldMethodNameConflict(String data) {
        this.data = data;
    }

    // Method with the same name as the field
    public void data() { // BUG: AvoidFieldNameMatchingMethodName
        System.out.println("This is a method with the same name as a field.");
    }

    // Method to demonstrate the bug
public String showBug(String input){
    FieldMethodNameConflict example = new FieldMethodNameConflict(input);
    example = new FieldMethodNameConflict(input);
    example.data();
    return example.data;
}

    public static void main(String[] args) {
        FieldMethodNameConflict conflict = new FieldMethodNameConflict("Hello");
        System.out.println(conflict.showBug("Test"));
    }
}