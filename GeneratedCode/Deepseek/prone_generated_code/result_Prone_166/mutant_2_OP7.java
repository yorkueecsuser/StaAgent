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
        // Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is a mutation");
            break;
        }
        return populate(builder);
    }

    class Message {
        static class Builder {
            // builder implementation
        }
    }
}