import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.Builder builder) { // Mutated lines
        boolean conditionFor = false; // Unreachable for loop
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // Unreachable code
        }
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
}