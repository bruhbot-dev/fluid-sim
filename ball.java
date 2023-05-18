import java.util.ArrayList;

import javax.print.attribute.standard.Copies;

public class ball{
    private float radius;
    private Vector2 location;
    public Vector2 sumForces;
    private double mass;


    
    public ball(float radius, Vector2 location, Vector2 sumForces, double mass) {
        this.radius = radius;
        this.location = location;
        this.sumForces = sumForces;
        this.mass = mass;
        System.out.println("test");
    }


    public Vector2 calcAccel(){
        double accelComponent1 = this.sumForces.component1 / mass;
        double accelComponent2 = this.sumForces.component2 / mass;
        
        Vector2 accelVec = new Vector2(accelComponent1, accelComponent2);
        System.out.println("test3");
        return accelVec;

    }

    public Vector2 calcSumForces(ArrayList<Vector2> forceArray){
        Vector2 copySumForces = this.sumForces;
        for (Vector2 i: forceArray) {
            copySumForces.Add(i);
          }
          return copySumForces;

    public calcVeloc(){
        
    }

    public Vector2 movePos(){

    }
    }
}