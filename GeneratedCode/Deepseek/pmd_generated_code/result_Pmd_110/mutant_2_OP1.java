import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        String str = "randomString"; // Dead Store
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    }
}