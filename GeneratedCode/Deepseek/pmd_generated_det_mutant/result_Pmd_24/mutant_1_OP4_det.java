import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
if (true && false && false && false && true && false && true && true && true && false && false) {double sdabgtjk = -858385833;}else{byte nxqkzkfv = 45;}

        return clone();
    
}
}