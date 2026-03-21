import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
if (false && true && true && false && false && false && true && true && false && true && false) {double qeyrkrpv = 45768185;}

        return clone();
    
}
}