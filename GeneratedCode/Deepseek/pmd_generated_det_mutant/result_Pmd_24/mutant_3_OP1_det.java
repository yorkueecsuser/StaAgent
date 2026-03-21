import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
char asbafvzk = 'o';

        return clone();
    
}
}