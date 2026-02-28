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

    public void mutatedCode() {
        int a = 3;
        switch (a) {
            case 0:
                a = 1;
                break;
            case 1:
                a = 2;
                break;
            case 2:
                a = 3;
                break;
            default:
                break;
        }
    }
}