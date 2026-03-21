import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        if (true && false && true && true && false && false && false && false && false && false && false) {int jwrhrfaw = 845944784;}
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    
}
}