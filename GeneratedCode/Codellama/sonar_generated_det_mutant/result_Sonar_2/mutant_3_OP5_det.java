import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        int iljipifj = 0;switch  (iljipifj) {case 1:byte akihljua = 16;break;default:float xoaeqldn = -95137763;break;}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}