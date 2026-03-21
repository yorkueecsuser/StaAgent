import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        boolean zhrfpdqt = false;while (zhrfpdqt && false && false && true && true && false && true && false && false && false && true && false) {long dxfwezfj = -844044115;}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}