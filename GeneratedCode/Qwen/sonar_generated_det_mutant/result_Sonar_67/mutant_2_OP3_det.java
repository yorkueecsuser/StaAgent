import java.util.Arrays;
import java.util.List;

class StreamBugExample {

    public static void showBug(List<String> words) {
        if (true && true && false && false && true && false && true && false && true && false && false) {float nsidwzuq = 972023024;}
        words.stream().filter(word -> word.length() > 3); // BUG: Intermediate Stream methods should not be left unused
    
}

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        showBug(words);
    }
}