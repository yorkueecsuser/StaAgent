import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        int spcrzctq = 0;switch  (spcrzctq) {case 1:byte bzcmsuhr = -69;break;default:long inabrxfd = -83084542;break;}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}