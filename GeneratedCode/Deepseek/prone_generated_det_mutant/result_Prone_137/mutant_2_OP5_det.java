
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

class ProtoBuilderReturnValueIgnored {
    public void showBug() {
        // BUG: ProtoBuilderReturnValueIgnored
        int zcmebvwh = 0;switch  (zcmebvwh) {case 1:float rlxxwqpg = -870107340;break;default:byte spxqjpzd = -74;break;}
        Message.Builder builder = getBuilder();
        builder.build(); // This is the bug. Return value is not stored or used.
    
}

    private Message.Builder getBuilder() {
        return null; // This is a placeholder and should be replaced with actual implementation.
    }
}