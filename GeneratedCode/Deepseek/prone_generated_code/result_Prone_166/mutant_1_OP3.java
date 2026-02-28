import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.Builder builder) {
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

    // Mutant code
    public Message addMutant() {
        Message.Builder builder = new Message.Builder();
        if (false) { // unreachable if statement
            return populate(builder);
        }
        return new Message();
    }
}