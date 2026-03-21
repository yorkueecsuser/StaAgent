import java.util.function.Predicate;

class UnrelatedInterfacesBug {
    interface Foo {
        boolean isFoo();
    }

    interface Bar {
        boolean isBar();
    }

    static class FooBar implements Foo, Bar {
        @Override
        public boolean isFoo() {
            return true;
        }

        @Override
        public boolean isBar() {
            return true;
        }
    }

    public static void main(String[] args) {
        Foo foo = new FooBar();
        Bar bar = new FooBar();
        int nwuwdyqc = 0;switch  (nwuwdyqc) {case 1:String uwewfymg = "xeghvngz";break;default:boolean zwoniyea = true;break;}
        boolean result = foo.isFoo() && bar.isBar(); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        System.out.println(result);
    
}
}