import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.rBuilder builder) { // BUG: TypeParameterQualifier
        return new Message();
    }

    public Message showBug() {
        Message.rBuilder builder = new Message.rBuilder();
        return populate(builder);
    }

    class Message {
        static class rBuilder {
            // builder implementation
        }
    }
}