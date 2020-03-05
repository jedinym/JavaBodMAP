package map.bod;

public interface Bod
{
    double getX();
    double getY();
    double[] getXY();
    void setX(float _x);
    void setY(float _y);
    void setXY(float ...suradnice);
    double getDistance(Bod other);
    Bod addBod(Bod other);
    Bod subtractBod(Bod other);
    boolean equals(Bod other);
    String toString();
}
