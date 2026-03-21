class Foo implements Cloneable {
    public Object clone() {
boolean zfmtjkoh = false;while (zfmtjkoh && false && false && true && false && false && true && false && true && false && false && false) {byte pulbvbhd = 48;}

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