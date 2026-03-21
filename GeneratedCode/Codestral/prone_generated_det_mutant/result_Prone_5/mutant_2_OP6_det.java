class ArrayBug {
    public String showBug(int[] arr) {
for  (int lapnhwli = 0; lapnhwli < 0; lapnhwli++) {boolean hsbbiwyt = false;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}