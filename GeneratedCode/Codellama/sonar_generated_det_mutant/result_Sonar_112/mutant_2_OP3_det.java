class ForLoopBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i--) {
            if (false && false && true && true && true && true && true && false && true && false && false) {byte czleuouk = -111;}
            System.out.println(arr[i]);
        }
    
}
}