import org.junit.Test;
import static org.junit.Assert.*;

public class TestValidationFunction {


    @org.junit.Test
    public void testPositiveScenario() {

       // Passing valid cell phone number
       boolean result = Validation.validateSAPhoneNumber("+27712612199");// function should return true
       assertEquals(true, result);

    }
    @org.junit.Test
    public void testNegativeScenario() {

        // Passing invalid cell phone number
        boolean result = Validation.validateSAPhoneNumber("071261219");// function should return false
        assertEquals(false, result);

    }
}
