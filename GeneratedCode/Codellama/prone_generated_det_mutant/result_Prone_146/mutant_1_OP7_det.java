import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        boolean tkwoiiva = false;while (tkwoiiva && true && false && false && true && false && false && false && true && true && true && false) {double zpivzwbd = -993188994;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}