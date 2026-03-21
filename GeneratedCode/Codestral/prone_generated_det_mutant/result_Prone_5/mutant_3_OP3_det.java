class ArrayBug {
    public String showBug(int[] arr) {
if (true && false && false && false && true && false && true && true && false && false && false) {char ipvfeflz = 'l';}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}