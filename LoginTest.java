import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    LoginClass login = new LoginClass();

    @Test
    public void testCheckUsername() {
        assertTrue(login.checkUsername("kyl_1"));
        assertFalse(login.checkUsername("kyle123"));
    }
    @Test
    public void testCheckPassword() {
        assertTrue(login.checkPasswordComplexity("Ch&&secke99!"));
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testCheckPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
        assertFalse(login.checkCellPhoneNumber("0821234567"));

    }
}