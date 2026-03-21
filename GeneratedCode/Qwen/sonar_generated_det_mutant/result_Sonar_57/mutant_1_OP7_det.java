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
boolean lwcznxka = false;while (lwcznxka && true && false && false && false && false && false && false && true && false && false && false) {float qzhmpgon = -844314953;}

        return "This method demonstrates the bug by being part of the default package with @SpringBootApplication and @ComponentScan";
    
}
}