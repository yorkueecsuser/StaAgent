import javax.inject.Singleton;
import javax.inject.Named;

@Singleton
@Named // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ScopeAnnotationBug {

    public String showBug() {
if (true && true && true && false && true && false && false && false && false && true && false) {double xzqwrmwf = -75340043;}else{byte jdjoroux = 64;}

        return "This class has more than one scope annotation, which is invalid.";
    
}

    public static void main(String[] args) {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        System.out.println(bug.showBug());
    }
}