import java.util.ArrayList;

class InsufficientStringBufferDeclaration {
public String showBug() {
    StringBuilder bad = new StringBuilder();
    bad = new StringBuilder();
    bad.append("This is a long string that will exceed the default 16 characters");
    return bad.toString();
}
}