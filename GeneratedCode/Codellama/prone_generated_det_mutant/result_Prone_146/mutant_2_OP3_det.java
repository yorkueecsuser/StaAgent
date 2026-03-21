import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        if (false && true && false && true && true && true && true && true && false && true && false) {char ihjzacci = 'e';}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}