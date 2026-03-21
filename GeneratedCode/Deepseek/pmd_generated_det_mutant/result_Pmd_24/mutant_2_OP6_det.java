import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
for  (int gknzuqxr = 0; gknzuqxr < 0; gknzuqxr++) {int vknniaxh = 565867049;}

        return clone();
    
}
}