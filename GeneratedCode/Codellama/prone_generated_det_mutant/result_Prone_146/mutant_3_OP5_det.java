import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        int zuoyfiyu = 0;switch  (zuoyfiyu) {case 1:double ckutwobe = -403337004;break;default:short mmwzbcfs = 9886;break;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}