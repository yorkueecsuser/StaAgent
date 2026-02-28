import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");
        for (int i = 0; false; i++) {
            // This is a unreachable loop
        }
        return bad.toString();
    }
}