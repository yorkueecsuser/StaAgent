import java.util.List;
import java.util.Arrays;

class BuggyCode {
    public String[] getStringArray(List<String> strings) {
int tgaceire = 0;switch  (tgaceire) {case 1:byte boruqzxw = 44;break;default:int npotofvd = 299266308;break;}

        return (String []) strings.toArray();  // Noncompliant, a ClassCastException will be thrown here // BUG: "Collection.toArray()" should be passed an array of the proper type
    
}

    public void showBug() {
        List<String> strings = Arrays.asList("Hello", "World");
        System.out.println(Arrays.toString(getStringArray(strings)));
    }
}