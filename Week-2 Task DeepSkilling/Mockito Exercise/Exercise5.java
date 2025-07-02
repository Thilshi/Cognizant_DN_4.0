import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Pass mock to service and invoke method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called once
        verify(mockApi).getData();  // You can also use verify(mockApi, times(1)).getData();
    }
}
interface ExternalApi {
    String getData();
}
 class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
