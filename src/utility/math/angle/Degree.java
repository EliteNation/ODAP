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

package utility.math.angle;

public class Degree {

    double degree;
    
    public Degree(){
        this.degree = (1/360);
    }
    
    public Degree(ArcMinute a){
        this.degree = (a.minute*60);
    }
    
    public Degree(ArcSecond a){
        this.degree = (a.second*3600);
    }
    
    public Degree(MilliArcSecond a){
        this.degree = ((a.milliSecond*3600)*1000);
    }
    
    public Degree(MicroArcSecond a){
        this.degree = (((a.microSecond*3600)*1000)*1000);
    }
    
    public ArcMinute toMinute(){
        return new ArcMinute(this);
    }
    
    public ArcSecond toSecond(){
        return new ArcSecond(this);
    }
    
    public MilliArcSecond toMilliSecond(){
        return new MilliArcSecond(this);
    }
    
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}