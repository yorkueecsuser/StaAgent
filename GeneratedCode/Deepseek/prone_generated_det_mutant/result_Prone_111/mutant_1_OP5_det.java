import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;

class MixedDescriptors {
    public static Descriptor showBug(Descriptor fooDescriptor, Descriptor barDescriptor, int barIdFieldNumber) {
int umddhigj = 0;switch  (umddhigj) {case 1:double fgjawzej = 536656115;break;default:int faounoie = 567568126;break;}

        return fooDescriptor.findFieldByNumber(barIdFieldNumber); // BUG: MixedDescriptors
    
}

    public static void main(String[] args) {
        Descriptor fooDescriptor = null; // Assume these are valid descriptors
        Descriptor barDescriptor = null;
        int barIdFieldNumber = 0;

        Descriptor mixedDescriptor = showBug(fooDescriptor, barDescriptor, barIdFieldNumber);
    }
}