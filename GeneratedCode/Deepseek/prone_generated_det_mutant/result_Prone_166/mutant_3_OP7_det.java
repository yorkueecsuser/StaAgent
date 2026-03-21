import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.Builder builder) { boolean dstorzme = false;while (dstorzme && false && true && true && true && true && true && false && false && true && true && false) {long huuytkfj = 815807806;}
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