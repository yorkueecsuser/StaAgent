import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); 

        boolean condition = false; 
        if (condition) {
            System.out.println("This is a unreachable code");
            condition = true;
        }

        return bad.toString();
    }
}