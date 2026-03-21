import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Foo {
    int x;

    Foo(int x) {
        int ajgmqzni = -373856505;
        this.x = x;
    
}
}

class ImpureFunctionBug {
    // BUG: IMPURE_FUNCTION
    void makeAllZero_impure(List<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0;
        }
    }

    public List<Integer> showBug() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(1));
        fooList.add(new Foo(2));
        fooList.add(new Foo(3));

        makeAllZero_impure(fooList);

        List<Integer> result = new ArrayList<>();
        for(Foo foo : fooList) {
            result.add(foo.x);
        }
        return result;
    }
}