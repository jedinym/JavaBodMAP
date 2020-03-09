package map.bod;

public class Bod3D implements Bod3DInterface
{
    private double x;
    private double y;
    private double z;

    public Bod3D(double _x, double _y, double _z)
    {
        x = _x;
        y = _y;
        z = _z;
    }

    @Override
    public void setZ(double _z)
    {
        z = _z;
    }

    @Override
    public double getZ()
    {
        return z;
    }

    @Override
    public void setXYZ(double... suradnice)
    {
        x = suradnice[0];
        y = suradnice[1];
        z = suradnice[2];
    }

    @Override
    public double[] getXYZ()
    {
        return new double[] {x, y, z};
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
        setXYZ(suradnice[0], suradnice[1], suradnice[1]);
    }

    @Override
    public double getDistance(Bod other)
    {
        return Math.sqrt(((x-other.getX())*(x-other.getX())) + ((y - other.getY())*(y-other.getY())) + ((z-((Bod3D)other).getZ())*(z-((Bod3D)other).getZ())));
    }

    @Override
    public Bod addBod(Bod other)
    {
        return new Bod3D(x + other.getX(), y + other.getY(), z + ((Bod3D)other).getZ());
    }

    @Override
    public Bod subtractBod(Bod other)
    {
        return new Bod3D(x - other.getX(), y - other.getY(), z - ((Bod3D)other).getZ());
    }

    @Override
    public boolean equals(Bod other)
    {
        if (other == this)
            return true;

        if (!(other instanceof Bod3D))
            return false;

        return ((x == other.getX()) && (y == other.getY()) && (z == ((Bod3D)other).getZ()));
    }
}
