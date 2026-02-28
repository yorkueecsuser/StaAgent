import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.Builder builder) { // BUG: TypeParameterQualifier
        return new Message();
    }

    public Message showBug() {
        Message.Builder builder = new Message.Builder();
        return populate(builder);
    }

    class Message {
        static class Builder {
            // builder implementation
        }
    }

    // Newly added mutant code
    public void unreachableSwitchStatement() {
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 0:
                System.out.println("This branch should not be reachable");
                break;
            case 1:
                System.out.println("This branch should be reachable");
                break;
        }
    }
}