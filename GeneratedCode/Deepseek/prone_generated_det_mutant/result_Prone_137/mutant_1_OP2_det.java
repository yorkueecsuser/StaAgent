
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

class ProtoBuilderReturnValueIgnored {
public void showBug() {
    Message.Builder builder = getBuilder();
    builder = getBuilder();
    builder.build();
}

    private Message.Builder getBuilder() {
        return null; // This is a placeholder and should be replaced with actual implementation.
    }
}