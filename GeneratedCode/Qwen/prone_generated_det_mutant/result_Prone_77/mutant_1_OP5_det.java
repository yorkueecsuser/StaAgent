import javax.inject.Singleton;
import javax.inject.Named;

@Singleton
@Named // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ScopeAnnotationBug {

    public String showBug() {
int mtgrhgtc = 0;switch  (mtgrhgtc) {case 1:boolean bqtskywt = true;break;default:boolean hlnbdxeo = true;break;}

        return "This class has more than one scope annotation, which is invalid.";
    
}

    public static void main(String[] args) {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        System.out.println(bug.showBug());
    }
}