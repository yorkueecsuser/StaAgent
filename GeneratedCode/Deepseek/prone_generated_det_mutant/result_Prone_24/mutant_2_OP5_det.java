import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        int joiaxvpm = 0;switch  (joiaxvpm) {case 1:long mwhskpkv = 43841051;break;default:String wgshyfsy = "ramljbif";break;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}