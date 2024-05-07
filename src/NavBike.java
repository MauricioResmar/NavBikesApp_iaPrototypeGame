
public class NavBike implements Cloneable {
    int id;
    String typeNavbik3;
    String versionIa;
    String color;
    int powerForce;
    
    public NavBike(){}
    public NavBike clonar() throws CloneNotSupportedException
    {
        return(NavBike)this.clone();
    }
}