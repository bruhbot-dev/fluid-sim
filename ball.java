import java.util.ArrayList;

import javax.print.attribute.standard.Copies;

public class ball{
    private float radius;
    private Vector2 position = new Vector2(0, 0);
    public Vector2 sumForces;
    private double mass;
    private Vector2 velocity = new Vector2(0, 0);
    private Vector2 accel; 
    private Vector2 copySumForces;


    
    public ball(float radius, Vector2 position, Vector2 sumForces, double mass) {
        this.radius = radius;
        this.position = position;
        this.sumForces = sumForces;
        this.mass = mass;
    }


    public Vector2 calcAccel(){
        double accelComponent1 = this.sumForces.component1 / mass;
        double accelComponent2 = this.sumForces.component2 / mass;
        
        Vector2 accelVec = new Vector2(accelComponent1, accelComponent2);
        return accelVec;

    }

    public void calcSumForces(ArrayList<Vector2> forceArray, Vector2 grav){

        this.copySumForces = this.sumForces;
        this.sumForces = copySumForces.Add(grav);
        for (Vector2 i: forceArray) {
            this.sumForces.Add(i);
        }

    }

    public void calcVeloc(){
        this.velocity.component1 = this.velocity.component1 + this.accel.component1;
        this.velocity.component2 = this.velocity.component2 + this.accel.component2;

        /*System.out.println("velocity:");
        System.out.println(velocity.print());*/



     }

    public Vector2 movePos(ArrayList<Vector2> outerforceArray, Vector2 grav){
        //System.out.println(position.print());
        calcSumForces(outerforceArray, grav);
        accel = calcAccel();
        calcVeloc();
        this.position = this.position.Add(this.velocity);
        System.out.println(this.position.print());
        return position;
    }
    
}