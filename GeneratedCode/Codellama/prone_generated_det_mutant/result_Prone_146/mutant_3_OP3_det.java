import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        if (true && true && false && true && true && true && false && false && true && false && false) {short zhqtekwl = 5923;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}