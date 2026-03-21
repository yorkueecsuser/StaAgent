import javax.inject.Singleton;
import javax.inject.Named;

@Singleton
@Named // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ScopeAnnotationBug {

    public String showBug() {
for  (int pgpnqxwd = 0; pgpnqxwd < 0; pgpnqxwd++) {double rcawncsn = 643516194;}

        return "This class has more than one scope annotation, which is invalid.";
    
}

    public static void main(String[] args) {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        System.out.println(bug.showBug());
    }
}