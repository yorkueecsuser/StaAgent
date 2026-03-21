class ArrayBug {
    public String showBug(int[] arr) {
for  (int owtiptus = 0; owtiptus < 0; owtiptus++) {int pwalobpy = -174504011;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}