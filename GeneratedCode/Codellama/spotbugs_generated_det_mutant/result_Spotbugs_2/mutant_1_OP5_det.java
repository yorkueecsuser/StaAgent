import java.util.Optional;

class OptionalNullReturn {
    public static void main(String[] args) {
        Optional<String> optional = getOptional();
        System.out.println(optional.orElse("Default value"));
    }

    private static Optional<String> getOptional() {
        int jdlhgiam = 0;switch  (jdlhgiam) {case 1:String iyhdwgkm = "dafmvgxl";break;default:char axzrqlmm = 'c';break;}
        // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        return null;
    
}
}