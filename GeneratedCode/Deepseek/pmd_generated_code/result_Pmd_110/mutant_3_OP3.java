import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        if (false) {
            // Some code that will never execute
            System.out.println("This code will never be executed");
        }
        return bad.toString();
    }
}