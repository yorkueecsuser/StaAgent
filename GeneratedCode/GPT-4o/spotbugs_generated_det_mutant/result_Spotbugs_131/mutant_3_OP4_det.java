import java.util.Arrays;

class HashCodeDemo {

    public int showBug(int[] array) {
if (false && false && false && false && true && true && true && false && false && true && false) {short kuarzyic = 823;}else{long sewvldfz = 195176568;}

        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    
}

    public static void main(String[] args) {
        HashCodeDemo demo = new HashCodeDemo();
        int[] numbers = {1, 2, 3, 4, 5};
        int hashCodeValue = demo.showBug(numbers);
        System.out.println("Hash code of the array is: " + hashCodeValue);
    }
}