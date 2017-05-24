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

package utility.math.trig;

import utility.math.trig.triangle.Adjacent;
import utility.math.trig.triangle.Opposite;

public class Cotangent {

    public double cotangent;
    
    public Cotangent(Adjacent a, Opposite o){
        this.cotangent = (a.adjacent / o.opposite);
    }
    
    public Cotangent(Arccotangent arccot){
        this.cotangent = (1 / arccot.arccotangent);
    }
    
    public Cotangent(Tangent tan){
        this.cotangent = (1 / tan.tangent);
    }
}