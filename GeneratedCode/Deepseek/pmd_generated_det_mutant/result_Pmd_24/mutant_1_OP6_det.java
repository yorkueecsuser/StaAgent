import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
for  (int ycydtfze = 0; ycydtfze < 0; ycydtfze++) {byte rumkpjss = -18;}

        return clone();
    
}
}