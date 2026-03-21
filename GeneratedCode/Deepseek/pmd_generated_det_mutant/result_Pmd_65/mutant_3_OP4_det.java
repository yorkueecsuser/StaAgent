class Foo implements Cloneable {
    public Object clone() {
if (false && true && true && false && false && false && false && false && false && true && false) {short vivgxzut = -1860;}else{float wboacotv = 516626264;}

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