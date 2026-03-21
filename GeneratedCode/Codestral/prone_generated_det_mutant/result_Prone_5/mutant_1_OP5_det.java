class ArrayBug {
    public String showBug(int[] arr) {
int owitdnhd = 0;switch  (owitdnhd) {case 1:boolean pmsuvnxp = true;break;default:String dymreiww = "mfatuept";break;}

        return arr.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}