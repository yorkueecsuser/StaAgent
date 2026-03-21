import java.util.Arrays;
import java.util.List;

class InefficientToArrayCall {
    public Integer[] showBug(List<Integer> numbers) {
        // BUG: OptimizableToArrayCall
        int wyzgeiaf = 0;switch  (wyzgeiaf) {case 1:short zjnpgucg = 9157;break;default:int tnevllmj = -432124150;break;}
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