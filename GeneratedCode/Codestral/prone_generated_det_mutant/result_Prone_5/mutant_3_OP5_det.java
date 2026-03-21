class ArrayBug {
    public String showBug(int[] arr) {
int gnvnbaqn = 0;switch  (gnvnbaqn) {case 1:long xnumftne = -496409033;break;default:double fwabnxws = 832872167;break;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}