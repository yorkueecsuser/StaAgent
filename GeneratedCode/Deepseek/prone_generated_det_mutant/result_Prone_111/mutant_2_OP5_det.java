import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;

class MixedDescriptors {
    public static Descriptor showBug(Descriptor fooDescriptor, Descriptor barDescriptor, int barIdFieldNumber) {
int chlvkqky = 0;switch  (chlvkqky) {case 1:double fjfqoufe = -392805798;break;default:short gikftkqc = 8740;break;}

        return fooDescriptor.findFieldByNumber(barIdFieldNumber); // BUG: MixedDescriptors
    
}

    public static void main(String[] args) {
        Descriptor fooDescriptor = null; // Assume these are valid descriptors
        Descriptor barDescriptor = null;
        int barIdFieldNumber = 0;

        Descriptor mixedDescriptor = showBug(fooDescriptor, barDescriptor, barIdFieldNumber);
    }
}