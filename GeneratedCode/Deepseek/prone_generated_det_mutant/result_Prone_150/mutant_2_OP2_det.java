import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
public int showBug(int [] array){
    Arrays.sort(array);
    int index = Arrays.binarySearch(array , array [ 0 ]);
    index = Arrays.binarySearch(array , array [ 0 ]);
    return index;
}
}