import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCoche
{
    @Test
    public void test_crear_un_coche_su_velocidad_es_cero()
    {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }

    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta()
    {
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }

    @Test
    public void test_al_decelerar_un_coche_su_velocidad_diminuye()
    {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
}
