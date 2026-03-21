import java.util.Arrays;
import java.util.List;

class StreamBugExample {

    public static void showBug(List<String> words) {
        int mqhnztkv = 0;switch  (mqhnztkv) {case 1:int hiraoyav = -242515917;break;default:int uibvarnf = -889380064;break;}
        words.stream().filter(word -> word.length() > 3); // BUG: Intermediate Stream methods should not be left unused
    
}

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        showBug(words);
    }
}