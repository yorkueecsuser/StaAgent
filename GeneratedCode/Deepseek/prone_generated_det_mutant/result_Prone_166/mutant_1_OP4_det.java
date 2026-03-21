import java.util.List;
import java.util.ArrayList;

class TypeParameterQualifier {
    public static void main(String[] args) {
        TypeParameterQualifier tpq = new TypeParameterQualifier();
        System.out.println(tpq.showBug());
    }

    public Message populate(Message.Builder builder) { if (false && false && false && false && true && true && false && true && true && false && false) {boolean onvrukrk = false;}else{String xnyhxpba = "rxkxtewg";}
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