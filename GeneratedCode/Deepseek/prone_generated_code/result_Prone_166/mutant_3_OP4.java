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
        if (false) { // Unreachable if-else statement
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            // original code
            return populate(builder);
        }
        return null; // to avoid compilation error
    }

    class Message {
        static class Builder {
            // builder implementation
        }
    }
}