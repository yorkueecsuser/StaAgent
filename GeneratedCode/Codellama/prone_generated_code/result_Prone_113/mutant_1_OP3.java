import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
		
		// Unreachable if statement mutant
		boolean condition = getCondition();
		if (condition) {
			System.out.println("This code is unreachable");
		}
    }
}