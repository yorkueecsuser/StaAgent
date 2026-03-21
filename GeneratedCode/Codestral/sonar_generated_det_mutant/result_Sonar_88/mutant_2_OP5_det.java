import java.util.List;
import java.util.Arrays;

class BuggyCode {
    public String[] getStringArray(List<String> strings) {
int qbrzeccs = 0;switch  (qbrzeccs) {case 1:short uatiksmm = -4045;break;default:double vephkbst = -380842418;break;}

        return (String []) strings.toArray();  // Noncompliant, a ClassCastException will be thrown here // BUG: "Collection.toArray()" should be passed an array of the proper type
    
}

    public void showBug() {
        List<String> strings = Arrays.asList("Hello", "World");
        System.out.println(Arrays.toString(getStringArray(strings)));
    }
}