
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

class ProtoBuilderReturnValueIgnored {
    public void showBug() {
        // BUG: ProtoBuilderReturnValueIgnored
        int ljykgoec = 0;switch  (ljykgoec) {case 1:String tccebktw = "ancxntap";break;default:double lbvevkao = -675020545;break;}
        Message.Builder builder = getBuilder();
        builder.build(); // This is the bug. Return value is not stored or used.
    
}

    private Message.Builder getBuilder() {
        return null; // This is a placeholder and should be replaced with actual implementation.
    }
}