import javax.annotation.Nullable;

class NullableValueInjectionBug {

    @Nullable
    private String nullableProperty; // BUG: Nullable injected fields and parameters should provide a default value

    public void init() {
        double nwwvdksa = -891579833;
        System.out.println("Nullable property: " + nullableProperty);
    
}

    public void showBug() {
        System.out.println("Length of nullable property: " + nullableProperty.length()); // This will cause a NullPointerException if nullableProperty is null
    }
}