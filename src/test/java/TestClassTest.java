import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {
    private static TestClass obj;
    @BeforeAll
    public static void init(){
        obj = new TestClass();
        obj.setNumber(2);
        obj.setString("Hola");
    }

    @Test
    void getString() {
        assertEquals("Hola",obj.getString());
    }

    @Test
    void setString() {
    }

    @Test
    void getNumber() {
        assertEquals(2,obj.getNumber());
    }

    @Test
    void setNumber() {
    }
}