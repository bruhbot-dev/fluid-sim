public class test {
    public static void main(String[] args) {
        
    
    Vector2 testVec = new Vector2(10, -5);
    Vector2 testVec2 = new Vector2(10, -5);

    Vector2 resultVec = testVec.Add(testVec2);
   // System.out.println(resultVec.print());

    Vector2 testVec3 = new Vector2(13, -2);
    Vector2 testVec4 = new Vector2(16, -7);
    Vector2 resultVec2 = testVec3.Sub(testVec4);
    //System.out.println(resultVec2.print());


    ball testBall = new ball(1, testVec4, resultVec2, 1);
    
    Vector2 accelResultVec = testBall.calcAccel();
    System.out.println(accelResultVec.print());

    }


}
