import java.util.stream.Stream;

class StreamBug {
public static void main(String [] args){
    Stream < Integer > pipeline = Stream.of(1 , 2 , 3 , 4 , 5);
    int sum1 = pipeline.sum();
    int sum2 = pipeline.mapToInt(i -> i * 2 ).sum();
    sum2 = pipeline.mapToInt(i -> i * 2 ).sum();
    System.out.println(sum1);
    System.out.println(sum2);
}
}