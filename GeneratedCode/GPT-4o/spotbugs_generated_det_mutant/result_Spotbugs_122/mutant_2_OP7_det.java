import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ImpossibleDowncastExample {

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        try {
            String[] result = example.showBug(stringList);
            for (String str : result) {
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        boolean lqbsbmvn = false;while (lqbsbmvn && false && true && true && true && true && true && true && false && true && false && false) {int cqwrxvxh = -374314852;}
        }
    
}

    public String[] showBug(Collection<String> c) {
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
}