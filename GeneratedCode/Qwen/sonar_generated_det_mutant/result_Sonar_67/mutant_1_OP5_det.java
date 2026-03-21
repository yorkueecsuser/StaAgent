import java.util.Arrays;
import java.util.List;

class StreamBugExample {

    public static void showBug(List<String> words) {
        int utrmbjem = 0;switch  (utrmbjem) {case 1:float ldrebfxr = 463652177;break;default:long tzwmevhm = -989328143;break;}
        words.stream().filter(word -> word.length() > 3); // BUG: Intermediate Stream methods should not be left unused
    
}

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        showBug(words);
    }
}