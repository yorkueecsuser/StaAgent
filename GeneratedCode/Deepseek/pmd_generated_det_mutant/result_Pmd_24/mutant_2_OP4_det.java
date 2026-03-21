import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
if (false && true && true && true && true && false && false && false && false && false && false) {float pngcmtff = 876367187;}else{long srsymmex = 991916557;}

        return clone();
    
}
}