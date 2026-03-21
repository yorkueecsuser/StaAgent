import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        int skuevmry = 0;switch  (skuevmry) {case 1:long lvcnqhzc = 205090206;break;default:long mktenkzq = -492755684;break;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}