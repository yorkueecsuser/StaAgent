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
int xlvtcwwf = 0;switch  (xlvtcwwf) {case 1:byte fsbmrdtq = -34;break;default:boolean uvnbysrd = true;break;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}