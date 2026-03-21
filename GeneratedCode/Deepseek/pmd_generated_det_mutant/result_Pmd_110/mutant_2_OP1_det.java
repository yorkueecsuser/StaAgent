import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        byte urvkycjx = 94;
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    
}
}