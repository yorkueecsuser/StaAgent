import java.lang.CloneNotSupportedException;

class Foo implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
int sdcmjjof = 0;switch  (sdcmjjof) {case 1:char gxkijpai = 'j';break;default:short emajovul = -9832;break;}

        return clone();
    
}
}