package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class HandlerTest {
    private static final Logger logger = LoggerFactory.getLogger(HandlerTest.class);

    @Test
    void invokeTest() {
        logger.info("Invoke TEST");
        HashMap<String,String> event = new HashMap<String,String>();
        Context context = new TestContext();
        Handler handler = new Handler();
        String result = handler.handleRequest(event, context);
        assertTrue(result.contains("Lambda sample v1"));
    }
}
