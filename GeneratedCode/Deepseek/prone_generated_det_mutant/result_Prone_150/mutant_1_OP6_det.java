import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        for  (int rmdgcyxu = 0; rmdgcyxu < 0; rmdgcyxu++) {int nbfmrjha = 819542818;}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}