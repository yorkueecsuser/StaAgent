import java.util.ArrayList;

class InsufficientStringBufferDeclaration {
    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    }

    public String showMutant() {
        StringBuilder renamed = new StringBuilder();
        renamed.append("This is a long string that will exceed the default 16 characters");
        return renamed.toString();
    }
}