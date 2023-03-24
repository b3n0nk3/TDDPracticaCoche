public class Coche
{
    int velocidad;

    public void acelerar_Angel_Fuentes(int aceleracion)
    {
        velocidad += aceleracion;
    }

    public void decelerar_Angel_Fuentes(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0)
        {
            velocidad = 0;
        }
    }
}
