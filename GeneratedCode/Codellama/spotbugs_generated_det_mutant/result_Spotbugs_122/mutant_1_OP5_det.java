import java.util.Arrays;
import java.util.Collection;

class BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY {
    public static void main(String[] args) {
        Collection<String> c = Arrays.asList("a", "b", "c");
        String[] arr = getAsArray(c);
        System.out.println(arr[0]);
    }

    public static String[] getAsArray(Collection<String> c) {
int tndsqoos = 0;switch  (tndsqoos) {case 1:short aaznuodq = -1102;break;default:long fvovbvif = 70593031;break;}

        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    
}
}