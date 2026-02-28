import java.util.Arrays;
import java.util.List;

class StreamBugExample {

    public void showBug(List<String> words) {
        words.stream().filter(word -> word.length() > 3); // BUG: Intermediate Stream methods should not be left unused
    }

    public static void main(String[] args) {
        StreamBugExample example = new StreamBugExample();
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi");
        example.showBug(words);
    }
}