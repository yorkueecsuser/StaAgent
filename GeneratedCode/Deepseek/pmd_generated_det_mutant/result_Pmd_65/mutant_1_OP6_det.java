class Foo implements Cloneable {
    public Object clone() {
for  (int rllgmsuq = 0; rllgmsuq < 0; rllgmsuq++) {int zlxnaxyc = -34790519;}

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