// Imports
import java.lang.annotation.*;
import com.facebook.infer.annotation.*;

// Annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@interface YourAnnotationName {}

// Class definition
class JavaAllocNegativeSizeExample {
public static void main(String [] args){
    int [] tempArray = new int [ Math.abs(50)];
    tempArray = new int [ Math.abs(50)];
    for(int i = 0; i < 2; i ++){ for(int j = 0; j < 2; j ++){ if(i + j > 0){ int result = 10; int size = Math.abs(result)% 50; tempArray = new int [ size ]; System.out.println("Result: " + result + ", Array size: " + size); } } }
}
}