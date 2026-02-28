import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder e = new StringBuilder();
        e.append("This is a long string that will exceed the default 16 characters"); // Mutated variable name: 'bad' to 'e'
        return e.toString();
    }
}