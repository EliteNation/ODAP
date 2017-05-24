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

public class ArcSecond {

    double second;
    
    public ArcSecond(){
        this.second = ((1/60)/60);
    }
    
    public ArcSecond(Degree a){
        this.second = (a.degree/3600);
    }
    
    public ArcSecond(ArcMinute a){
        this.second = (a.minute/60);
    }
    
    public ArcSecond(MilliArcSecond a){
        this.second = (a.milliSecond*1000);
    }
    
    public ArcSecond(MicroArcSecond a){
        this.second = ((a.microSecond*1000)*1000);
    }
    
    public Degree toDegree(){
        return new Degree(this);
    }
    
    public ArcMinute toMinute(){
        return new ArcMinute(this);
    }
    
    public MilliArcSecond toMilliSecond(){
        return new MilliArcSecond(this);
    }
    
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}