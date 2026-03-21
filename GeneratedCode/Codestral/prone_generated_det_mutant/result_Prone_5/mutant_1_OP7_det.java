class ArrayBug {
    public String showBug(int[] arr) {
boolean mtygpobm = false;while (mtygpobm && true && false && true && true && false && true && false && true && false && false && false) {int gbjwdwwi = -428778443;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}