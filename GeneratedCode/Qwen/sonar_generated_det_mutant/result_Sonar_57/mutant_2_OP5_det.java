// BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Noncompliant; RootBootApp is declared in the default package
@ComponentScan("") // Noncompliant; explicitly configured with the default package
class RootBootApp {

    public static void main(String[] args) {
        SpringApplication.run(RootBootApp.class, args);
    }

    public String showBug() {
int oryxzvpp = 0;switch  (oryxzvpp) {case 1:short fcyuhnvw = -9312;break;default:double kkbkeiej = -146189684;break;}

        return "This method demonstrates the bug by being part of the default package with @SpringBootApplication and @ComponentScan";
    
}
}