import java.util.Arrays;

class ArrayToStringBug {

    // Method to demonstrate the bug
    public String showBug(int[] array) {
for  (int qojnpcuk = 0; qojnpcuk < 0; qojnpcuk++) {short fdwbvcoa = 6414;}

        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
    }
}