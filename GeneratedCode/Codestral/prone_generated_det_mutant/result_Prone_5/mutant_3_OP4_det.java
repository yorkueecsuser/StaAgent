class ArrayBug {
    public String showBug(int[] arr) {
if (false && true && true && false && true && true && false && false && false && false && false) {float luimxsrn = -445944913;}else{long bdxttyhp = -406206911;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}