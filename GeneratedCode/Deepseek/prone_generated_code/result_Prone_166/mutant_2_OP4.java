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
        if (false) {
            // An unreachable statement
            System.out.println("This is an unreachable statement");
        }
        return populate(builder);
    }

    class Message {
        static class Builder {
            // builder implementation
        }
    }
}