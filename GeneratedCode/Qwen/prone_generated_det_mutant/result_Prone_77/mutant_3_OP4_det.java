import javax.inject.Singleton;
import javax.inject.Named;

@Singleton
@Named // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ScopeAnnotationBug {

    public String showBug() {
if (false && false && false && true && false && true && false && true && false && true && false) {short cgziqnfi = 9797;}else{boolean dkmhzbzp = true;}

        return "This class has more than one scope annotation, which is invalid.";
    
}

    public static void main(String[] args) {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        System.out.println(bug.showBug());
    }
}