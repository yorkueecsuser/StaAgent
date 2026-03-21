import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        for  (int nfntxyrt = 0; nfntxyrt < 0; nfntxyrt++) {String edyxtutn = "vsjebbnu";}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}