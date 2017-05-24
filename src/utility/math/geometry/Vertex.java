/*
 * Object Detection and Avoidance Program
 * --------------------------------------
 * 
 * This project may be found under ODAP: https://github.com/EliteNation/ODAP
 * 
 * Laws and Agreement of usage may be found under: https://github.com/EliteNation/Laws
 */

/**
 *
 * @author Caleb
 */ 

package utility.math.geometry;

public class Vertex {
    
    double x;
    double y;
    double z;
    
    public Vertex(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double getZ(){
        return this.z;
    }
    
    public void updateX(double x){
        this.x = x;
    }
    
    public void updateY(double y){
        this.y = y;
    }
    
    public void updateZ(double z){
        this.z = z;
    }   
}