import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        int ppbsswri = 0;switch  (ppbsswri) {case 1:boolean caxoakpa = false;break;default:short iawtzcih = -2284;break;}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}