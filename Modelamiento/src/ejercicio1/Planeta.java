/*

 */
package ejercicio1;

/**
 *
 * @author Daniel CAVS
 */
public abstract class Planeta {
    //atributo
    public final String id;   
    public String name;
    public double masa;
    public double densidad;
    public double diametro;
    public double distAlSol;
    //Contructor

    public Planeta() {
        this.id = "";
        this.name = "";
        this.masa = 0;
        this.densidad = 0;
        this.diametro = 0;
        this.distAlSol = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistAlSol() {
        return distAlSol;
    }

    public void setDistAlSol(double distAlSol) {
        this.distAlSol = distAlSol;
    }
    //Formula de la attracion de dos cuerpos
    public double atraccionCuerpo(Planeta p){
        double dist = this.getDistAlSol()-p.getDistAlSol();
        double GRAVITY = 6.672 * (Math.pow(10, -11));
        
        return GRAVITY*this.getMasa()*p.getMasa()/Math.pow(dist, 2);
       
    }
    
    
    
    @Override
    public String toString() {
        return "Planeta{" + "id=" + id + ", name=" + name + ", masa=" + masa + ", densidad=" + densidad + ", diametro=" + diametro + ", distAlSol=" + distAlSol + '}';
    }
       
    
   
 

}