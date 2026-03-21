import java.util.Arrays;

class HashCodeDemo {

    public int showBug(int[] array) {
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    public static void main(String[] args) {
        HashCodeDemo demo = new HashCodeDemo();
        int[] wccwusnk = {1, 2, 3, 4, 5};
        int opuvxaup = demo.showBug(wccwusnk);
        System.out.println("Hash code of the array is: " + opuvxaup);
    }
}