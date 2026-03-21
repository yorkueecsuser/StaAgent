class Foo implements Cloneable {
    public Object clone() {
for  (int gmcmjcvi = 0; gmcmjcvi < 0; gmcmjcvi++) {long jtjgrbas = 52740636;}

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