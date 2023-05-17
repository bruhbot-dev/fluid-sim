public class Vector2 {

   private double component1;
   private double component2;


   public Vector2(double component1, double component2) {
      this.component1 = component1;
      this.component2 = component2;
   }

   public String print(){
      double output = this.component1 + this.component2;
      String stringOutput = String.valueOf(output);
      return stringOutput;
   }

   public Vector2 Add(Vector2 Vec2){

      double component1 = this.component1 + Vec2.component1;
      double component2 = this.component2 + Vec2.component2;

      Vector2 returnVector  = new Vector2(component1, component2);
      return returnVector;
  }

   public Vector2 Sub(Vector2 Vec1, Vector2 Vec2){

      double component1 = this.component1 - Vec2.component1;
      double component2 = this.component2 - Vec2.component2;

      Vector2 returnVector  = new Vector2(component1, component2);
      return returnVector;
   }

   /*double Multi(Vector2 Vec1, Vector2 Vec2){

   }  */
   
   //dotProduct()

   }