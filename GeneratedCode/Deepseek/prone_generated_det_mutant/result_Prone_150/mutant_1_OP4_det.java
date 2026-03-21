import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        if (false && true && false && true && false && false && false && false && false && false && false) {long dxqqdclw = -252097581;}else{long oofwshqs = -252698867;}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}