import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        if (false && true && false && true && true && false && true && true && true && true && false) {float yhlztnvd = -954584270;}else{char nqqoggfu = 'o';}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}