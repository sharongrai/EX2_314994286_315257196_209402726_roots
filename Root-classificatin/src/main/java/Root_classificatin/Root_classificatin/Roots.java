package Root_classificatin.Root_classificatin;



enum Root_Types {
      No_roots,
      Not_quadratic,
      Equal_roots,
      Two_roots,
      ERROR
      
	}

//Roots class source from example
public class Roots
{
  
   private static Root_Types roots;
   //vi
   private static boolean out_of_Range(double x, double min, double max) {
       return (x < min || x > max);
   }
   public static void calculate_roots(double a, double b, double c)
   {
      double q = b*b - 4*a*c; //טעות ה2 שונה ל4;
         
      if (out_of_Range(a, 0, 50)|| out_of_Range(b, 0, 50)||out_of_Range(c, 0, 100)) {
    	  roots = Root_Types.ERROR;
    	  return;
      }
      
      if (a != 0) {
	      if(q>0 )
	      {
	    	//Two_roots שונה ל
		      roots = Root_Types.Two_roots; 
	      }
	      else if(q==0)
	      {
		      // the equation has exactly one root
		      roots = Root_Types.Equal_roots; 
	      } 
	      else
	      {
		      // the equation has no roots if b^2 < 4ac
		      roots = Root_Types.No_roots;
	      }
      }
      else {
    	  //Not_quadraticשונה ל
    	  roots = Root_Types.Not_quadratic; 
      }
   }
    public static Root_Types root_types()
    {	
    	return roots;
    }

 }
