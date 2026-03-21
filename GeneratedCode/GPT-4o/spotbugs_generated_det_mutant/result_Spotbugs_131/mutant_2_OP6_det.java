import java.util.Arrays;

class HashCodeDemo {

    public int showBug(int[] array) {
for  (int dtusmbdk = 0; dtusmbdk < 0; dtusmbdk++) {int jfyftcjw = 345295139;}

        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    
}

    public static void main(String[] args) {
        HashCodeDemo demo = new HashCodeDemo();
        int[] numbers = {1, 2, 3, 4, 5};
        int hashCodeValue = demo.showBug(numbers);
        System.out.println("Hash code of the array is: " + hashCodeValue);
    }
}