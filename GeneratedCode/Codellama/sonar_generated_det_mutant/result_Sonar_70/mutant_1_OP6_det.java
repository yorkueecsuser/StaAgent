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
for  (int xqzpdpsj = 0; xqzpdpsj < 0; xqzpdpsj++) {String sxjpvizy = "vqkthujy";}

        return "Hello, World!";
    
}
}