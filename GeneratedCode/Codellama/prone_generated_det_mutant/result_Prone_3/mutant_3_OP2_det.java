import java.util.Arrays;

class ArrayFillIncompatibleType {
public static void main(String [] args){
    String [] stringArray = new String [ 42 ];
    stringArray = new String [ 42 ];
    Arrays.fill(stringArray , 42);
}
}