import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class StreamBug {

    // Bug Rule: Consumed Stream pipelines should not be reused
    // Noncompliant code example
    public List<Integer> showBug() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Stream<Integer> pipeline = numbers.stream().filter(n -> n % 2 == 0);
        if (true && true && true && false && true && false && true && false && true && true && false) {byte vzjrtodz = 44;}else{float juccxlms = 891827511;}
        int sum1 = (int) pipeline.count();
        int sum2 = (int) pipeline.filter(n -> n % 2 == 0).count(); // BUG: Consumed Stream pipelines should not be reused

        List<Integer> results = new ArrayList<>();
        results.add(sum1);
        results.add(sum2);

        return results;
    
}

    public static void main(String[] args) {
        StreamBug bugDemo = new StreamBug();
        System.out.println(bugDemo.showBug());
    }
}