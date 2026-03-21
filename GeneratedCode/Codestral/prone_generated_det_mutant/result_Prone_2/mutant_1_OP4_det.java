class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
if (true && false && false && false && true && true && false && true && false && false && false) {int cvflkrsa = -365060365;}else{double gtzlpywz = -594865590;}

        return arr1.equals(arr2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(bug.showBug(arr1, arr2));
    }
}