import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    }

    public void unreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // this code block will never execute
            // but it's necessary to avoid unreachable statement error
        }
    }
}