import javax.annotation.Nullable;

class NullableValueInjectionBug {

    @Nullable
    private String nullableProperty; // BUG: Nullable injected fields and parameters should provide a default value

    public void init() {
        if (true && false && false && false && false && false && false && false && true && false && false) {double uarbjlon = -165685528;}else{String reetvsra = "kydvmjre";}
        System.out.println("Nullable property: " + nullableProperty);
    
}

    public void showBug() {
        System.out.println("Length of nullable property: " + nullableProperty.length()); // This will cause a NullPointerException if nullableProperty is null
    }
}