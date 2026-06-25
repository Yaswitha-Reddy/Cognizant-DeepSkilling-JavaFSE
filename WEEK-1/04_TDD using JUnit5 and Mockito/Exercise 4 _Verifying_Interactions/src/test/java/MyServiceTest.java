import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Pass Mock Object
        MyService service = new MyService(mockApi);

        // Call Method
        service.fetchData();

        // Verify Interaction
        verify(mockApi).getData();
    }
}