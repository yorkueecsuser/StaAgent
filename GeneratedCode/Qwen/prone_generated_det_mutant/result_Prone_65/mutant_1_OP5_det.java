class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
int jpfaaxil = 0;switch  (jpfaaxil) {case 1:int fpqmirre = -771407225;break;default:short hlutqmex = -3614;break;}

        return message;
    
}

    public static void main(String[] args) {
        GuiceExample example = new GuiceExample();
        System.out.println(example.showBug());
    }
}