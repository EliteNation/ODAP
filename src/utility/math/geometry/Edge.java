/*
 * Object Detection and Avoidance Program
 * --------------------------------------
 * 
 * This project may be found under ODAP: https://github.com/EliteNation/ODAP
 * 
 * Laws and Agreement of usage may be found under: https://github.com/EliteNation/Laws
 */
package utility.math.geometry;

import utility.math.algebra.Math;
/**
 *
 * @author Caleb
 */
public class Edge {
    
    Vertex point1;
    Vertex point2;
    
    
    public Edge(Vertex point1, Vertex point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    
    public Vertex getPoint1(){
        return point1;
    }
    
    public Vertex getPoint2(){
        return point2;
    }
    
    public void updatePoint1(Vertex point1){
        this.point1 = point1;
    }
    
    public void updatePoint2(Vertex point2){
        this.point2 = point2;
    }
    
    public double getDistance(){ //square root
        return (Math.square(point2.getX() - point1.getX()) + Math.square(point2.getY() - point1.getY()) + Math.square(point2.getZ() - point1.getZ()));
    }
}
