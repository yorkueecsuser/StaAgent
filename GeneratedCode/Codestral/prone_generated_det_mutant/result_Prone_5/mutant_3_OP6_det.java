class ArrayBug {
    public String showBug(int[] arr) {
for  (int hufcocdp = 0; hufcocdp < 0; hufcocdp++) {double lxsktqcj = 44695893;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}