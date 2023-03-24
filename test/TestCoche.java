import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCoche
{
    @Test
    public void test_crear_un_coche_su_velocidad_es_cero_Angel_Fuentes()
    {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }

    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_Angel_Fuentes()
    {
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_Angel_Fuentes(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }

    @Test
    public void test_al_decelerar_un_coche_su_velocidad_diminuye_Angel_Fuentes()
    {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Angel_Fuentes(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menos_de_cero_Angel_Fuentes()
    {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Angel_Fuentes(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}
