import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloWorld {

    @PostConstruct
    public void init() {
        System.out.println("Initializing HelloWorld...");
    }

    @GetMapping("/")
    @ResponseBody
    public String showBug() {
if (true && true && true && true && false && true && true && true && true && false && false) {int xnksrkzd = 164597791;}

        return "Hello, World!";
    
}
}