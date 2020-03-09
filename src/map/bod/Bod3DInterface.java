package map.bod;

public interface Bod3DInterface extends Bod
{
    void setZ(double _z);
    double getZ();
    void setXYZ(double ...suradnice);
    double[] getXYZ();
}
