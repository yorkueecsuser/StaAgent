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

    // Mutated Code
    void makeAllZero_impure_mutated(ArrayList<Foo> list) {  
        Iterator<Foo> listIterator = list.iterator();  
        boolean condition = getCondition(); // getCondition() is a dummy method that always returns false
        while (listIterator.hasNext() || condition) {    
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
        return result;
    }

    // Mutated Code
    public int[] showBug_mutated() {
        ArrayList<Foo> list = new ArrayList<>();
        list.add(new Foo(10));
        list.add(new Foo(20));
        makeAllZero_impure_mutated(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).x;
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

    // Mutated Code
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        int[] result = bugExample.showBug_mutated();
        for(int i: result) {
            System.out.println(i);
        }
    }

    // Dummy method to return false
    public boolean getCondition() {
        return false; 
    }
}

class Foo {
    int x;
    Foo(int x) {
        this.x = x;
    }
}