package graficar;


public class Vector
{
    private double x,y;

    public Vector() 
    {
        this.x = 0;
        this.y = 0; 
    }

    public Vector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}