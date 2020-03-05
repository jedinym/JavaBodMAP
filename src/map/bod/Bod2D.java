package map.bod;

public class Bod2D implements Bod
{
    private double x;
    private double y;

    public Bod2D(double _x, double _y)
    {
        x = _x;
        y = _y;
    }

    @Override
    public double getX()
    {
        return x;
    }

    @Override
    public double getY()
    {
        return y;
    }

    @Override
    public double[] getXY()
    {
        return new double[] {x, y};
    }

    @Override
    public void setX(float _x)
    {
        x = _x;
    }

    @Override
    public void setY(float _y)
    {
        y = _y;
    }

    @Override
    public void setXY(float... suradnice)
    {
        x = suradnice[0];
        y = suradnice[1];
    }

    @Override
    public double getDistance(Bod other)
    {
        return (float)Math.sqrt((x*x) + (y*y));
    }

    @Override
    public Bod addBod(Bod other)
    {
        return new Bod2D(x + other.getX(), y + other.getY());
    }

    @Override
    public Bod subtractBod(Bod other)
    {
        return new Bod2D(x - other.getX(), y - other.getY());
    }

    @Override
    public boolean equals(Bod other)
    {
        return (x == other.getX()) && (y == other.getY());
    }
}
