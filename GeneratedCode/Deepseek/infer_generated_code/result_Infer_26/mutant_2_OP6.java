import java.util.ArrayList;
import java.util.Iterator;

class BugExample {

    // BUG: IMPURE_FUNCTION​
    void makeAllZero_impure(ArrayList<Foo> list) {  
        Iterator<Foo> listIterator = list.iterator();  
        while (listIterator.hasNext()) {    
            Foo foo = listIterator.next();    
            foo.x = 0;
        }
    }

    public int[] showBug() {
        ArrayList<Foo> list = new ArrayList<>();
        list.add(new Foo(10));
        list.add(new Foo(20));
        makeAllZero_impure(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).x;
        }
        // Mutation Operator: Unreachable for loop
        // Mutation Operator description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // The generated mutated Java code MUST maintain the original code, compile successfully, be unique, and avoid unreachable statement errors.
        for (int i = 0; false; i++) {
            result[i] = result[i];
        }
        return result;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        int[] result = bugExample.showBug();
        for(int i: result) {
            System.out.println(i);
        }
    }
}

class Foo {
    int x;
    Foo(int x) {
        this.x = x;
    }
}