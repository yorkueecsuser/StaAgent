import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    }

    public void addUnreachableSwitchStatement() {
        boolean unreachableCondition = false;
        int randomValue = 0;
        switch (randomValue) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
            default:
                break;
        }
    }
}