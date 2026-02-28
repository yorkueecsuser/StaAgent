import java.util.ArrayList;
import java.util.Iterator;

class BugExample {

    // BUG: IMPURE_FUNCTION​
    void makeAllZero_impure(ArrayList<Foo> list) {  
        Iterator<Foo> listIterator = list.iterator();  
        while (listIterator.hasNext()) {    
            Foo foo = listIterator.next();    
            foo.x = 0;
            foo.x = 0; // Adding mutant code here
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
}

class Foo {
    int x;
    Foo(int x) {
        this.x = x;
    }
}