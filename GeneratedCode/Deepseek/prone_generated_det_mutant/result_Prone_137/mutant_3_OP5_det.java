
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

class ProtoBuilderReturnValueIgnored {
    public void showBug() {
        // BUG: ProtoBuilderReturnValueIgnored
        int jpstxpxo = 0;switch  (jpstxpxo) {case 1:byte fuwmlmvp = -72;break;default:short yqianeim = 5970;break;}
        Message.Builder builder = getBuilder();
        builder.build(); // This is the bug. Return value is not stored or used.
    
}

    private Message.Builder getBuilder() {
        return null; // This is a placeholder and should be replaced with actual implementation.
    }
}