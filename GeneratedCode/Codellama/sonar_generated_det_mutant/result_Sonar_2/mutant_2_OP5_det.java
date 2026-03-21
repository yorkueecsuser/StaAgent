import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        int mzecqmco = 0;switch  (mzecqmco) {case 1:String czylpitl = "axbmtama";break;default:double ogxwlcrw = -679832914;break;}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}