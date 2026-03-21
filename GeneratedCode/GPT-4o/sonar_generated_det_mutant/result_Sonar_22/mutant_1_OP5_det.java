import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        int xiasunft = 0;switch  (xiasunft) {case 1:long rdglafaa = 144484045;break;default:int gzqofbbj = 989316376;break;}
        immutableList.add("New Element"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    
}

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}