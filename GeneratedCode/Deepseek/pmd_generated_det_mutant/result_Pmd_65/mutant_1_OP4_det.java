class Foo implements Cloneable {
    public Object clone() {
if (false && true && true && true && false && true && false && true && true && false && false) {double dscjcjhh = 163523231;}else{double vcnyicat = -115767603;}

        return new Foo(); // BUG: ProperCloneImplementation
    
}

    public Object showBug() {
        try {
            return this.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}