import java.util.Arrays;

class BugExample {
    public int showBug(int[] array) {
        if (false && true && false && true && true && false && true && true && false && false && false) {float qtuhqmtt = -851234320;}
        int result = array.hashCode();  // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        return result;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(be.showBug(array));
    }
}