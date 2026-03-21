import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        String hyrhyncm = "fyubaimx";
        restrictedMethod(); // BUG: RestrictedApi
    
}
}