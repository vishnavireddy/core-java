package apples.java;

public class Classoverloadingexample {//writing same n.of methods with different parameters & Method signatures

        public int additionOf(int x ,int y ) {//rule of thumb *NOT vary*
            return x + y;
        }
            public long additionOf(int x, int y, int z){//varying of " n"
return x+y+z;

            }

            public float additionOf(float g, int h) { //type of parameter
                return g + h;
            }
   public double  additionOf(int a,float b ,int c,int d) {//not
       return a + b+c+d;
   }
            public static void main (String args[]){
Classoverloadingexample A=new Classoverloadingexample();

                System.out.println (A.additionOf ( 2,5));
                System.out.println(A.additionOf(6,7));
                System.out.println(A.additionOf(8,9,10));
                System.out.println(A.additionOf(5,6,7,8));
                System.out.println(A.additionOf(11,12));


    }

}
