import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        for  (int tujndpia = 0; tujndpia < 0; tujndpia++) {boolean mdcjazvp = false;}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}