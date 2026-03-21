class ForLoopBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (true && true && true && true && true && false && true && false && false && false && false) {boolean ufwnxref = false;}
        for (int i = 0; i < arr.length; i--) {
            System.out.println(arr[i]);
        }
    
}
}