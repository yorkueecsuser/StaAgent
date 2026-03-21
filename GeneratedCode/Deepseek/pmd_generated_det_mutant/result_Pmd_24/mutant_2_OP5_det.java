import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
int yvlfeggb = 0;switch  (yvlfeggb) {case 1:boolean fvjzqtkg = false;break;default:byte vgdkbvcl = 83;break;}

        return clone();
    
}
}