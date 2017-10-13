import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import ru.varren.App;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@Slf4j
public class TicketBundleControllerTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;

    private static String jsonData = "{\n" +
            "\"currencyDate\":\"2017-10-12T00:00:00.000Z\",\n" +
            "\"amount\":150,\n" +
            "\"paymentType\": \"http://localhost:8080/api/v1/paymentTypes/2\"\n" +
            "}";
    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void testController() throws Exception {
        MockHttpServletRequestBuilder request = post("/api/v1/ticketBundles/1/payments")
                .content(jsonData).contentType("application/json");

        MvcResult result = this.mockMvc.perform(request)
            .andExpect(status().isOk())
                .andReturn();

        String content = result.getResponse().getContentAsString();
        log.info("\nResult from server: {}",content);
    }
}
