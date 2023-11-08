import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat = new Cat("Nala", 'M', 5);
    @BeforeEach
    void setUp() {
    }

    @Test
    void getName() {
        assertNotNull(cat.getName());
        assertFalse(cat.getName().isEmpty());
    }

    @Test
    void getGender() {
        assertTrue(cat.getGender() == 'M' || cat.getGender() == 'F');
    }

    @Test
    void getWeightInKg() {
        assertTrue(cat.getWeightInKg() >0 && cat.getWeightInKg()<= 10);
    }
}