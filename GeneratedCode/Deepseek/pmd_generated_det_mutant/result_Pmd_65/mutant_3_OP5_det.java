class Foo implements Cloneable {
    public Object clone() {
int ixofpbtk = 0;switch  (ixofpbtk) {case 1:byte adqmfhkm = -94;break;default:short ysauhtbb = -7418;break;}

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