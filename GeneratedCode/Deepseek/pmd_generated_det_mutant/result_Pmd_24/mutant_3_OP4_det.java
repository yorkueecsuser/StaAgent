import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
if (true && true && false && false && true && true && true && true && false && false && false) {int bbqgltpf = 640513791;}else{float ckkzzcxd = -741957917;}

        return clone();
    
}
}