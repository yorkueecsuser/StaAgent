
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

class ProtoBuilderReturnValueIgnored {
    public void showBug() {
        // BUG: ProtoBuilderReturnValueIgnored
        if (false && false && true && false && false && true && true && true && false && false && false) {short tqlnvuqp = 548;}else{float nonrnekz = 683735028;}
        Message.Builder builder = getBuilder();
        builder.build(); // This is the bug. Return value is not stored or used.
    
}

    private Message.Builder getBuilder() {
        return null; // This is a placeholder and should be replaced with actual implementation.
    }
}