import javax.annotation.PostConstruct;

class BeanConfig {

    private String bean1;
    private String bean2;

    @PostConstruct
    public void init() {
        bean1 = myBean(); // BUG: Beans in "@Configuration" class should have different names
        bean2 = myBean(); // BUG: Beans in "@Configuration" class should have different names
    }

    public String myBean() {
        return "First Bean";
    }

    public String myBean() { // BUG: Beans in "@Configuration" class should have different names
        return "Second Bean";
    }

    public String showBug() {
        return bean1 + ", " + bean2;
    }
}