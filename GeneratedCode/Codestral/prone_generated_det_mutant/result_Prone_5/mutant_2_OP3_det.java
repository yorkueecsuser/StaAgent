class ArrayBug {
    public String showBug(int[] arr) {
if (false && true && true && true && true && false && true && true && false && false && false) {long hlzshbfs = 91535476;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}