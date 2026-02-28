import java.lang.*;

class NullPointerExceptionBug {
    private String nullString;
    private String renamedVariable; // MUTATION: added a new variable to be renamed

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        return "Length: " + nullString.length(); // Original bug
    }

    public void showBug() {
        initialize();
        String renamedVariable = null; // MUTATION: initializing the renamed variable to null
        System.out.println("Renamed variable length: " + renamedVariable.length()); // MUTATION: using the renamed variable in the problematic line
        System.out.println(getNullStringLength()); // This will still throw a NullPointerException
    }

    public static void main(String[] args) {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug();
    }
}