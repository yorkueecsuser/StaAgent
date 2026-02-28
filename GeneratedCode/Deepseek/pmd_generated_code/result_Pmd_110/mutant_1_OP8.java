import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder a = new StringBuilder();
        a.append("This is a long string that will exceed the default 16 characters"); 
        return a.toString();
    }
}