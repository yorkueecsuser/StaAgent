import javax.inject.Inject;

class MoreThanOneInjectableConstructor {
    private String data;

    @Inject
    public MoreThanOneInjectableConstructor() {
        this.data = "Default Constructor";
    }

    @Inject
    public MoreThanOneInjectableConstructor(String data) {
        this.data = data;
    }

    public String showBug() {
int slgcmtxt = 0;switch  (slgcmtxt) {case 1:boolean mvwtsuvw = true;break;default:long qeoefqqk = 336214249;break;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}