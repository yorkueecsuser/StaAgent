import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        if (true && true && false && false && false && false && false && true && false && false && false) {long nigznpmv = -919409230;}else{String czvtizzo = "tppjihev";}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}