import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier a = new TypeParameterQualifier();
        System.out.println(a.showBug());
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
}