package com.userregistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTestExceptions {
    UserRegistration user = new UserRegistration();

    @Test
    void givenFirstName_whenProper_shouldReturnValid() {
        try {
            boolean result = user.firstName("Amol");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenFirstName_WhenImproper_ShouldReturnInValid() {
        try {
            boolean result = user.firstName("amol");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void giveLastName_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.lastName("Ghotale");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void giveLastName_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.lastName("ghotale");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenEmail_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.email("abc@gmail.com");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenEmail_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.email("abc@.gmail.com");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenMobileNumber_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.mobileNumber("91 8657169656");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenMobileNumber_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.mobileNumber("911 8657169656");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleOne_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.ruleOne("abcdefghi");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleOne_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.ruleOne("abcd");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleTwo_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.ruleTwo("AbcdeTGhi");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleTwo_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.ruleTwo("abcde");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleThird_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.ruleThird("1abcdefghi");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleThird_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.ruleThird("abcd");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleFourth_WhenProper_ShouldReturnValid() {
        try {
            boolean result = user.ruleFourth("abcdefghi#");
            assertEquals(true, result);
        } catch (Exception e) {
        }
    }

    @Test
    void givenRuleFourth_WhenImProper_ShouldReturnInValid() {
        try {
            boolean result = user.ruleFourth("abcdef");
            assertEquals(false, result);
        } catch (Exception e) {
        }
    }
}