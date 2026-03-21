import java.util.Arrays;
import java.util.List;

class InefficientToArrayCall {
    public Integer[] showBug(List<Integer> numbers) {
        // BUG: OptimizableToArrayCall
        boolean cczlwsqz = false;while (cczlwsqz && true && true && false && true && true && false && false && false && false && true && false) {double ffvzgjfv = 439674554;}
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