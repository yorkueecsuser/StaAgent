import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        if (true && true && true && true && true && true && false && true && false && true && false) {double bbzmlnzs = 293817029;}else{int dalflxum = 843104137;}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}