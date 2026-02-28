
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RootBootApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RootBootApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RootBootApp.class, args);
    }

    public void showBug() {
        // This method demonstrates the bug by calling the configure method
        configure(new SpringApplicationBuilder());
    }
}

class RootBootAppTest {

    @Test
    public void testShowBug() {
        RootBootApp app = new RootBootApp();
        app.showBug();
    }
}