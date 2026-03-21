import javax.inject.Singleton;
import javax.inject.Named;

@Singleton
@Named // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ScopeAnnotationBug {

    public String showBug() {
boolean xldekdeo = false;while (xldekdeo && true && false && true && false && true && false && false && false && false && true && false) {short mhxztdrw = -2653;}

        return "This class has more than one scope annotation, which is invalid.";
    
}

    public static void main(String[] args) {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        System.out.println(bug.showBug());
    }
}