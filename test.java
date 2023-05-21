import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
    
    Vector2 emptyVec = new Vector2(0, 0);
    Vector2 startPushVec = new Vector2(50, 70);
    Vector2 grav = new Vector2(-9.8, 0);
    
    /*Vector2 testVec = new Vector2(10, -5);
    Vector2 testVec2 = new Vector2(10, -5);

    Vector2 resultVec = testVec.Add(testVec2);
   // System.out.println(resultVec.print());

    Vector2 testVec3 = new Vector2(13, -2);
    Vector2 testVec4 = new Vector2(16, -7);
    Vector2 resultVec2 = testVec3.Sub(testVec4);
    //System.out.println(resultVec2.print());


    ball testBall = new ball(1, emptyVec, resultVec2, 1);
    
    Vector2 accelResultVec = testBall.calcAccel();
    System.out.println(accelResultVec.print());*/

    ball testBall = new ball(1, emptyVec, emptyVec, 1);


    ArrayList<Vector2> testArrayInitial = new ArrayList<Vector2>();
    testArrayInitial.add(0, startPushVec);

    ArrayList<Vector2> testArray = new ArrayList<Vector2>();
    testArray.add(0, emptyVec);
    testArray.add(1, emptyVec);



    testBall.movePos(testArrayInitial, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);
    testBall.movePos(testArray, grav);



    }


}
