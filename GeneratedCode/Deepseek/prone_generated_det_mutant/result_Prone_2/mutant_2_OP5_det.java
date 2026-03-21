class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int jldsxecm = 0;switch  (jldsxecm) {case 1:byte icoekzbg = -67;break;default:float oqjjjuii = 123227900;break;}
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        return areEqual;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}