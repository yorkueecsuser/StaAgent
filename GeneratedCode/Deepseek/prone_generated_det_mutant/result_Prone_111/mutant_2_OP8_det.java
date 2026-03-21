import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;

class MixedDescriptors {
    public static Descriptor showBug(Descriptor fooDescriptor, Descriptor barDescriptor, int barIdFieldNumber) {
        return fooDescriptor.findFieldByNumber(barIdFieldNumber); // BUG: MixedDescriptors
    }

    public static void main(String[] args) {
        Descriptor fooDescriptor = null; // Assume these are valid descriptors
        Descriptor barDescriptor = null;
        int mvzwfvlf = 0;

        Descriptor mixedDescriptor = showBug(fooDescriptor, barDescriptor, mvzwfvlf);
    }
}