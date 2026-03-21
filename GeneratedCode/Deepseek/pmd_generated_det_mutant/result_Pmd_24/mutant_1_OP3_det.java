import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
if (true && false && false && false && true && false && true && false && false && false && false) {long ygkixaty = -333913535;}

        return clone();
    
}
}