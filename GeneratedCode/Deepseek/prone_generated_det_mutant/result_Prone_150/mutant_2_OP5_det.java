import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        int kaqiinua = 0;switch  (kaqiinua) {case 1:char uhbplosi = 'u';break;default:double zokndest = -292188423;break;}
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}