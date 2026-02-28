import java.util.ArrayList;
import java.util.Iterator;

class BugExample {

    // BUG: IMPURE_FUNCTION​
    void makeAllZero_impure(ArrayList<Foo> list) {  
        Iterator<Foo> listIterator = list.iterator();  
        boolean mutationCondition = getCondition(); // mutation: if condition is declared here and false, the while loop is unreachable
        if(mutationCondition) {
            while (listIterator.hasNext()) {    
                Foo foo = listIterator.next();    
                foo.x = 0;
            }
        } else {
            // mutation: adding an unreachable code block
            System.out.println("This block of code is unreachable");
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

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        int[] result = bugExample.showBug();
        for(int i: result) {
            System.out.println(i);
        }
    }

    public boolean getCondition() { // mutation: a method is created to ensure the condition is determined at runtime
        return false;
    }
}

class Foo {
    int x;
    Foo(int x) {
        this.x = x;
    }
}