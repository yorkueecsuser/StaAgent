import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;

class ProtoStringFieldReferenceEquality {

    // BUG: ProtoStringFieldReferenceEquality
    public boolean compareStringsUsingReferenceEquality(Message protoMessage, FieldDescriptor fieldDescriptor) {
        String str1 = protoMessage.getField(fieldDescriptor).toString();
        String str2 = "example";
        return str1 == str2;
    }

    // BUG: ProtoStringFieldReferenceEquality
    public boolean compareStringsUsingEquals(Message protoMessage, FieldDescriptor fieldDescriptor) {
        String str1 = protoMessage.getField(fieldDescriptor).toString();
        String str2 = "example";
        return str1.equals(str2);
    }
}