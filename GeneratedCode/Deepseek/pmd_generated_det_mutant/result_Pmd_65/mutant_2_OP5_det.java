class Foo implements Cloneable {
    public Object clone() {
int agszkirj = 0;switch  (agszkirj) {case 1:byte yndzwadq = -118;break;default:float zijnzplc = 937308693;break;}

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