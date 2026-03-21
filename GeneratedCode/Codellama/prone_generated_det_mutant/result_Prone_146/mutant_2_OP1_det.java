import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        String pgzoaacr = "vmjtfakx";
        restrictedMethod(); // BUG: RestrictedApi
    
}
}