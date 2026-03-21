import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
for  (int emghbnoa = 0; emghbnoa < 0; emghbnoa++) {char lebzennt = 'i';}

        return clone();
    
}
}