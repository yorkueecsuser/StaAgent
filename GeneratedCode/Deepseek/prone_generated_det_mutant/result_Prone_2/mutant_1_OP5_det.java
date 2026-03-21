class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int nqrabpol = 0;switch  (nqrabpol) {case 1:boolean eexfmyju = false;break;default:String jdofrnhf = "acxjnbhu";break;}
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        return areEqual;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}