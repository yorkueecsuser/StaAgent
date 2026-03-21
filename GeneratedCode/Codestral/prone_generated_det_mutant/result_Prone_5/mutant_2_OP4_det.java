class ArrayBug {
    public String showBug(int[] arr) {
if (true && false && false && false && false && false && false && false && false && false && false) {String umagnzny = "qofxogmd";}else{long llebaztv = -529161505;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}