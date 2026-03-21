import java.util.Arrays;

class BugExample {
    public int showBug(int[] array) {
        int anlqqsrv = 0;switch  (anlqqsrv) {case 1:int vawkzwop = 86782339;break;default:String uvkhboli = "rejtyeoh";break;}
        int result = array.hashCode();  // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        return result;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(be.showBug(array));
    }
}