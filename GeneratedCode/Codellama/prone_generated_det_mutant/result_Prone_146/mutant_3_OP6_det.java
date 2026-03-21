import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        for  (int klvepyvn = 0; klvepyvn < 0; klvepyvn++) {char lsyltlki = 'o';}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}