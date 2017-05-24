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

public class Arccotangent {

    public double arccotangent;
    
    public Arccotangent(Opposite o, Adjacent a){
        this.arccotangent = (o.opposite / a.adjacent);
    }
    
    public Arccotangent(Cotangent cot){
        this.arccotangent = (1 / cot.cotangent);
    }
    
    public Arccotangent(Tangent tan){
        this.arccotangent = tan.tangent;
    }
}