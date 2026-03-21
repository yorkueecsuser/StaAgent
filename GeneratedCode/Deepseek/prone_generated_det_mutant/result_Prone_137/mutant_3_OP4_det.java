
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

class ProtoBuilderReturnValueIgnored {
    public void showBug() {
        // BUG: ProtoBuilderReturnValueIgnored
        if (true && false && true && true && false && false && true && true && true && false && false) {String qbhfyiql = "flgwtzss";}else{float inmjznbq = -514468911;}
        Message.Builder builder = getBuilder();
        builder.build(); // This is the bug. Return value is not stored or used.
    
}

    private Message.Builder getBuilder() {
        return null; // This is a placeholder and should be replaced with actual implementation.
    }
}