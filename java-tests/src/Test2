package mytests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Spisok {

    List <String> zadachi = new ArrayList<>();
    {
        zadachi.add("Помыть посуду");
        zadachi.add("Погулять");
        zadachi.add("Лечь спать");
    }
}

class TestSpisok {
    @Test
    public void  Test() {

        Spisok s1 = new Spisok();
        assertTrue(s1.zadachi.contains("Помыть посуду"), "в списке должно быть: Помыть посуду");
        assertEquals(3, s1.zadachi.size(), "Размер списка должен быть: 3");
        s1.zadachi.set(2, "Сделать ДЗ");
        assertEquals("Сделать ДЗ", s1.zadachi.get(2), "В списке должно быть: Сделать ДЗ под номером - 2 ");
        s1.zadachi.remove("Погулять");
        assertEquals(2, s1.zadachi.size(), "Размер списка должен быть: 2");

    }
}
