class Foo implements Cloneable {
    public Object clone() {
int tcgenibz = 0;switch  (tcgenibz) {case 1:long dfmvltjd = -289977448;break;default:float jnlkzyko = 79012261;break;}

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