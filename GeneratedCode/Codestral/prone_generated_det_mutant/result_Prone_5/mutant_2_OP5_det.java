class ArrayBug {
    public String showBug(int[] arr) {
int hzvujmkl = 0;switch  (hzvujmkl) {case 1:byte rrvehagf = -40;break;default:float oqokljyc = -703207614;break;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}