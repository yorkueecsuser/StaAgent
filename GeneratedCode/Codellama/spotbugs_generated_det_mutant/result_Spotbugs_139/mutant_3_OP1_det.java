import java.util.ArrayList;
import java.util.List;

class DMI_DOH {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        String xxvbvnnx = "qahezjhz";
        list.get(list.size());
    
}
}