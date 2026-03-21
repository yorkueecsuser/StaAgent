import java.util.Arrays;
import java.util.Collection;

class BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY {
    public static void main(String[] args) {
        Collection<String> c = Arrays.asList("a", "b", "c");
        String[] arr = getAsArray(c);
        System.out.println(arr[0]);
    }

    public static String[] getAsArray(Collection<String> c) {
for  (int siacrwpi = 0; siacrwpi < 0; siacrwpi++) {double euaigtfd = 619975110;}

        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    
}
}