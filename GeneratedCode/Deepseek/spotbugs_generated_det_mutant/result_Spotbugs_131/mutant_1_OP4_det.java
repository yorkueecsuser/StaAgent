import java.util.Arrays;

class BugExample {
    public int showBug(int[] array) {
        if (true && true && false && true && false && false && true && false && true && true && false) {byte ocidkprl = -48;}else{long tuyxphub = -42268805;}
        int result = array.hashCode();  // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        return result;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(be.showBug(array));
    }
}