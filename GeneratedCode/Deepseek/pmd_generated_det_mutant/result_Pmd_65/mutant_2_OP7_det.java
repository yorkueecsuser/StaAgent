class Foo implements Cloneable {
    public Object clone() {
boolean tyuladdy = false;while (tyuladdy && false && true && false && true && false && true && true && true && false && true && false) {short xyctbsfh = 2105;}

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