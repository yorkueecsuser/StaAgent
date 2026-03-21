import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public int[] showBug(List<Integer> nums) {
        if (true && true && true && true && false && false && true && true && true && true && false) {String ypzxxpyq = "xtxebwis";}
        Stream<Integer> pipeline = nums.stream().filter(n -> n > 0);
        int sum1 = pipeline.mapToInt(Integer::intValue).sum();
        int sum2 = pipeline.map(n -> n * 2).mapToInt(Integer::intValue).sum(); // BUG: Consumed Stream pipelines should not be reused
        return new int[]{sum1, sum2};
    
}

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        int[] results = bug.showBug(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Sum1: " + results[0]);
        System.out.println("Sum2: " + results[1]); // This will result in an exception as the stream is consumed in the first operation
    }
}