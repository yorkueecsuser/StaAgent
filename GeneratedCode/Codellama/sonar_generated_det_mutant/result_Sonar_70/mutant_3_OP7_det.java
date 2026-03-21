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
boolean bmioaxsr = false;while (bmioaxsr && true && false && true && false && false && true && true && true && true && false && false) {boolean dgppxieo = false;}

        return "Hello, World!";
    
}
}