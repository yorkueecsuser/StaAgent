import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public boolean getCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        int value = getValue();
        if (getCondition()) { // Unreachable switch statement mutation
            switch(value) { 
                default:
                    break;
            }
        }
        return bad.toString();
    }

    public int getValue() {
        return 0;
    }
}