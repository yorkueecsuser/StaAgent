class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int xxqbudnw = 0;switch  (xxqbudnw) {case 1:byte gwfrqujb = -38;break;default:short kdiwmifd = 5756;break;}
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        return areEqual;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}