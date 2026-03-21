import java.util.Arrays;

class BugExample {
    public int showBug(int[] array) {
        if (true && true && true && true && true && false && true && false && true && true && false) {short pbebosei = 3447;}
        int result = array.hashCode();  // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        return result;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(be.showBug(array));
    }
}