import java.util.Arrays;

class ArrayOutOfBounds {
public int [] showBug(int [] numbers){
    int [] results = new int [ numbers.length + 1 ];
    results = new int [ numbers.length + 1 ];
    for(int i = 0; i <= numbers.length; i ++){ results [ i ] = numbers [ i ]; }
    return results;
}

    public static void main(String[] args) {
        ArrayOutOfBounds aob = new ArrayOutOfBounds();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = aob.showBug(numbers);
        System.out.println(Arrays.toString(results));
    }
}