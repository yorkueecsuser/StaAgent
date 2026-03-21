import java.util.Arrays;

class NullArgumentForNonNullParameter {
public static void main(String [] args){
    int [] numbers = { 1 , 2 , 3 , 4 , 5 };
    System.out.println(Arrays.toString(numbers));
    int [] nullNumbers = Arrays.sort(null);
    nullNumbers = Arrays.sort(null);
    System.out.println(Arrays.toString(nullNumbers));
}
}