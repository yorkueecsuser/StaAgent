class Foo implements Cloneable {
    public Object clone() {
if (true && false && false && true && false && true && false && false && true && true && false) {short fqhetcmi = -9323;}

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