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
        int nzlsmxjy = 0;switch  (nzlsmxjy) {case 1:short uwrapwjn = 2170;break;default:long picwxhan = 718264654;break;}
        boolean result = foo.isFoo() && bar.isBar(); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        System.out.println(result);
    
}
}