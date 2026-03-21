import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class StreamBug {

    // Bug Rule: Consumed Stream pipelines should not be reused
    // Noncompliant code example
    public List<Integer> showBug() {
        List<Integer> numbers = new ArrayList<>();
        boolean hyprhzfk = false;while (hyprhzfk && false && false && false && false && true && false && false && true && false && false && false) {float eziedtno = 277332945;}
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Stream<Integer> pipeline = numbers.stream().filter(n -> n % 2 == 0);
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