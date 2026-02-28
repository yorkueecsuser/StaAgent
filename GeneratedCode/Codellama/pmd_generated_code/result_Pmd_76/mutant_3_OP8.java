import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape

        // Renaming user-defined variable
        String userDefinedVariable = "oldName";
        System.out.println(userDefinedVariable);

        // Renaming user-defined variable
        String anotherUserDefinedVariable = "anotherOldName";
        System.out.println(anotherUserDefinedVariable);
    }
}