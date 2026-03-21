class Foo implements Cloneable {
    public Object clone() {
if (true && true && false && true && true && true && true && true && true && true && false) {byte bsbnnbyh = -13;}else{boolean eqwrmqnh = true;}

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