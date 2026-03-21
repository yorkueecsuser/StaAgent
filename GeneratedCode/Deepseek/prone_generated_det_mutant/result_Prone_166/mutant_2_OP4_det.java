import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.Builder builder) { if (true && false && true && false && true && false && false && false && true && false && false) {int ywfgxexx = 918752615;}else{char cnaulchf = 'a';}
 // BUG: TypeParameterQualifier
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