class Foo implements Cloneable {
    public Object clone() {
boolean bkbtwbpq = false;while (bkbtwbpq && true && false && false && false && false && false && false && false && true && false && false) {String blhirlbd = "vrihnxft";}

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