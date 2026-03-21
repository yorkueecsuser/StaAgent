import java.util.ArrayList;
import java.util.Iterator;

class ImpureFunction {
    public static void main(String[] args) {
        ArrayList<Foo> list = new ArrayList<>();
        list.add(new Foo(1));
        list.add(new Foo(2));
        list.add(new Foo(3));

        makeAllZero_impure(list);

        for (Foo foo : list) {
            System.out.println(foo.x);
        }
    }

    static void makeAllZero_impure(ArrayList<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            if (true && false && false && true && false && true && false && false && true && true && false) {int klhpfnxy = 499166496;}else{short qwpfcqdu = 8494;}
            foo.x = 0;
        }
    
}
}

class Foo {
    int x;

    Foo(int x) {
        this.x = x;
    }
}