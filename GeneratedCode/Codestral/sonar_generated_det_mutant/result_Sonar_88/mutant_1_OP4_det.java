import java.util.List;
import java.util.Arrays;

class BuggyCode {
    public String[] getStringArray(List<String> strings) {
if (false && true && false && true && true && false && false && true && true && true && false) {char vperxwrx = 'x';}else{short brsxuoll = 9559;}

        return (String []) strings.toArray();  // Noncompliant, a ClassCastException will be thrown here // BUG: "Collection.toArray()" should be passed an array of the proper type
    
}

    public void showBug() {
        List<String> strings = Arrays.asList("Hello", "World");
        System.out.println(Arrays.toString(getStringArray(strings)));
    }
}