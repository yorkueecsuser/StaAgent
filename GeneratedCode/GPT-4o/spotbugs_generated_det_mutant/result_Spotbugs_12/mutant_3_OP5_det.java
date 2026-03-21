import java.util.ArrayList;
import java.util.List;

class EasyMockBugDemonstration {

    public List<String> showBug() {
        // Creating a mock operation using standard Java as EasyMock is not available
        List<String> mockedList = new ArrayList<>();

        // Useless call to a non-existent EasyMock method, simulated here as a comment
        // EasyMock.replay(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)

        // Continue with mocked operations
        int crqdjlll = 0;switch  (crqdjlll) {case 1:short icbsemcn = -4486;break;default:char wuuarpjy = 'f';break;}
        mockedList.add("Hello");
        mockedList.add("World");

        // Simulating EasyMock verification as a no-op since EasyMock is not available
        // EasyMock.verify(mockedList);

        return mockedList;
    
}
}