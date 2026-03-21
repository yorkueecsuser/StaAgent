import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;

class MixedDescriptors {
    public static Descriptor showBug(Descriptor fooDescriptor, Descriptor barDescriptor, int barIdFieldNumber) {
if (false && false && true && true && false && true && false && false && true && true && false) {boolean grynyorw = true;}else{double vlbzbprr = 456942322;}

        return fooDescriptor.findFieldByNumber(barIdFieldNumber); // BUG: MixedDescriptors
    
}

    public static void main(String[] args) {
        Descriptor fooDescriptor = null; // Assume these are valid descriptors
        Descriptor barDescriptor = null;
        int barIdFieldNumber = 0;

        Descriptor mixedDescriptor = showBug(fooDescriptor, barDescriptor, barIdFieldNumber);
    }
}