import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        if (false && false && true && false && true && false && true && true && false && false && false) {String jtvxvebb = "qbjgxivg";}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}