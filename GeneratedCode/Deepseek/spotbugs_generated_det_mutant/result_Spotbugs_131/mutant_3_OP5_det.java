import java.util.Arrays;

class BugExample {
    public int showBug(int[] array) {
        int opvyfmby = 0;switch  (opvyfmby) {case 1:boolean ltqacxir = false;break;default:int zkshfphl = 723301587;break;}
        int result = array.hashCode();  // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        return result;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(be.showBug(array));
    }
}