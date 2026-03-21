import java.util.Arrays;
import java.util.Collection;

class BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY {
    public static void main(String[] args) {
        Collection<String> c = Arrays.asList("a", "b", "c");
        String[] arr = getAsArray(c);
        System.out.println(arr[0]);
    }

    public static String[] getAsArray(Collection<String> c) {
if (true && false && false && true && true && true && false && true && true && true && false) {String jafhooqa = "nchfvvmq";}else{float dunqeyip = 595323339;}

        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    
}
}