import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        boolean trafyvjk = false;while (trafyvjk && false && true && true && false && true && true && true && false && false && false && false) {String lnmrurhu = "infxqmal";}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}