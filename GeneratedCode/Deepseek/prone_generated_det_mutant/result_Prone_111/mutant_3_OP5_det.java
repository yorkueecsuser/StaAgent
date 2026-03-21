import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;

class MixedDescriptors {
    public static Descriptor showBug(Descriptor fooDescriptor, Descriptor barDescriptor, int barIdFieldNumber) {
int byisgwtv = 0;switch  (byisgwtv) {case 1:long eaacytfw = 292416541;break;default:double zasuhfms = 154800571;break;}

        return fooDescriptor.findFieldByNumber(barIdFieldNumber); // BUG: MixedDescriptors
    
}

    public static void main(String[] args) {
        Descriptor fooDescriptor = null; // Assume these are valid descriptors
        Descriptor barDescriptor = null;
        int barIdFieldNumber = 0;

        Descriptor mixedDescriptor = showBug(fooDescriptor, barDescriptor, barIdFieldNumber);
    }
}