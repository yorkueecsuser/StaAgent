import java.util.Arrays;
import java.util.List;

class InefficientToArrayCall {
    public Integer[] showBug(List<Integer> numbers) {
        // BUG: OptimizableToArrayCall
        if (false && true && true && true && true && true && false && true && true && false && false) {int nhznplxl = -853340066;}else{long yqdbhiiy = -383399287;}
        Integer[] arr = numbers.toArray(new Integer[numbers.size()]);
        return arr;
    
}

    public static void main(String[] args) {
        InefficientToArrayCall obj = new InefficientToArrayCall();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] arr = obj.showBug(numbers);
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}