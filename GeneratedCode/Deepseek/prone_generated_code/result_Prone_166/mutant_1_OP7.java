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

    // Mutant Code
    public Message showMutantBug() {
        Message.Builder builder = new Message.Builder();
        
        // Unreachable While Loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Do nothing
        }
        
        return populate(builder);
    }
}