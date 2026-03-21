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
int yaupclei = 0;switch  (yaupclei) {case 1:long nutggyez = -959559444;break;default:double pjivxwxw = 946531155;break;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}