import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
int uwzvsmqb = 0;switch  (uwzvsmqb) {case 1:boolean dsqhrpxd = false;break;default:float cvewjkoz = -87514134;break;}

        return clone();
    
}
}