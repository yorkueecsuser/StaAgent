import java.lang.*;

class NullPointerDereferenceBug {

    private String nullString;
    private String a; // Mutant: Renaming a variable

    public void initializeString(String str) {
        this.a = str; // Mutant: Using the renamed variable
    }

    public void showBug() {
        if (a!= null) { // Mutant: Adding null check for the renamed variable
            System.out.println(a.length());
        } else {
            System.out.println(nullString.length()); // Original bug is maintained
        }
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}