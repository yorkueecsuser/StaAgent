import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        if (false && true && false && true && false && true && true && true && false && false && false) {boolean ljyidikb = true;}else{char apobpuvo = 'h';}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}