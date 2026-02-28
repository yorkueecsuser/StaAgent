import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters"); // Duplicated append statement
        return bad.toString();
    }
}