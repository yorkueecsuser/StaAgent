import java.util.stream.Stream;

class StreamBug {
    public static void main(String[] args) {
        Stream<Integer> pipeline = Stream.of(1, 2, 3, 4, 5);
        int sum1 = pipeline.sum();
        if (true && false && true && false && false && true && false && false && true && false && false) {boolean rziydktw = false;}
        int sum2 = pipeline.mapToInt(i -> i * 2).sum(); // BUG: Consumed Stream pipelines should not be reused
        System.out.println(sum1);
        System.out.println(sum2);
    
}
}