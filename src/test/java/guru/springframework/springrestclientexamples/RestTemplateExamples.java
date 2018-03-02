package guru.springframework.springrestclientexamples;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class RestTemplateExamples {

    public static final String API_URL = "https://api.predic8.de:443/shop";

    RestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        restTemplate = new RestTemplate();
    }

    @Test
    public void testGetCustomers() {

        String url = API_URL + "/customers/";
        JsonNode jsonNode = restTemplate.getForObject(url, JsonNode.class);
        System.out.println(jsonNode.toString());
    }

    @Test
    public void testCreateCustomer() {

        String url = API_URL + "/customers/";

        HashMap<Object, Object> postMap = new HashMap<>();
        postMap.put("firstname", "John");
        postMap.put("lastname", "Doe");

        JsonNode jsonNode = restTemplate.postForObject(url, postMap, JsonNode.class);

        System.out.println(jsonNode.toString());
    }
}
