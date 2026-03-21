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
int orjzajfr = 0;switch  (orjzajfr) {case 1:double dxxwaawo = -243012478;break;default:double dhjbmlnf = 795681881;break;}

        return "Hello, World!";
    
}
}