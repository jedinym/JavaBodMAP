package map.bod;

public interface Bod
{
    float getX();
    float getY();
    float[] getXY();
    void setX(float _x);
    void setY(float _y);
    void setXY(float ...suradnice);
    float getDistance(Bod other);
    Bod addBod(Bod other);
    Bod subtractBod(Bod other);
    boolean equals(Bod other);
    String toString();
}
