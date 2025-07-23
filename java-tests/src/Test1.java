package mytests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ZADACHI {

    @Test
    public void cheTamKakTam () {

        Map<String, String> zadania = new HashMap<>();

        zadania.put("утро", "встать");
        zadania.put("день", "работать");
        zadania.put("вечер", "играем в доту2");

        assertEquals(3, zadania.size(), "Должно быть - 3");
        assertTrue(zadania.containsKey("день"), "Ключ (день) должен существовать");
        assertTrue(zadania.containsValue("встать"), "Значение (встать) должно существовать");
        zadania.put("вечер", "лечь спать");
        assertEquals("лечь спать", zadania.get("вечер"), "Если ключ (вечер), значение должно быть (лечь поспать)");
        zadania.remove("день");
        assertEquals(2, zadania.size(), "Должно быть - 2");
    }
}
