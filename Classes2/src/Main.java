import ball.Container;
import ball.MyBall;
import complex.MyComplex;
import jdk.swing.interop.SwingInterOpUtils;
import polynomial.MyPolynomial;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        MyComplex comp1 = new MyComplex();
        MyComplex comp2 = new MyComplex(16.9,4.7);
        System.out.println("Complex number 1 : " + comp1);
        System.out.println("Complex number 2 : " + comp2);
        System.out.println("Complex number 1 has a real part of number - it is " + comp1.isReal());
        System.out.println("Complex number 2 has an imaginary part of number - it is " + comp2.isImaginary());
        System.out.println("Complex number 1 = Complex number 2 - is " + comp1.equals(comp2));
        System.out.println("Complex number 2 = (16.9 + 4.7i) - is " + comp2.equals(16.9,4.7));
        System.out.println();
        System.out.println("Changing complex number 1...");
        comp1.setValue(19.8, 6.3);
        System.out.println("New complex number 1 : " + comp1);
        System.out.println("Changing complex number 2...");
        comp2.setReal(8.6);
        comp2.setImag(15.2);
        System.out.println("New complex number 2 : " + comp2);
        MyComplex comp3 = comp1.AddNew(comp2);
        MyComplex comp4 = comp1.SubtractNew(comp2);
        System.out.println("Complex number 1 + Complex number 2 = " + comp3 + " (Complex number 3)");
        System.out.println("Complex number 1 - Complex number 2 = " + comp4 + " (Complex number 4)");
        comp1.Multiply(comp2);
        comp2.Divide(comp1);
        System.out.println("Complex number 1 * Complex number 2 = " + comp1 + "(New Complex number 1)");
        System.out.println("Complex number 2 / Complex number 1 = " + comp2 + "(New Complex number 2)");
        System.out.println();
        System.out.println("Absolute values:");
        System.out.println("|Complex number 1| = " + comp1.Magnitude());
        System.out.println("|Complex number 2| = " + comp2.Magnitude());
        System.out.println("|Complex number 3| = " + comp3.Magnitude());
        System.out.println("|Complex number 4| = " + comp4.Magnitude());
        System.out.println("Arguments: ");
        System.out.println("Arg(comp1) = " + comp1.Argument());
        System.out.println("Arg(comp2) = " + comp2.Argument());
        System.out.println("Arg(comp3) = " + comp3.Argument());
        System.out.println("Arg(comp4) = " + comp4.Argument());
        System.out.println("Conjugare values: ");
        System.out.println(comp1.Conjugate() + " for Complex number 1");
        System.out.println(comp2.Conjugate() + " for Complex number 2");
        System.out.println(comp3.Conjugate() + " for Complex number 3");
        System.out.println(comp4.Conjugate() + " for Complex number 4");
        System.out.println();
        System.out.println();


        System.out.println("Task 2");
        double[] cof1 = new double[4];
        cof1[0] = 19.2;
        cof1[1] = 18.6;
        cof1[2] = 6.3;
        cof1[3] = 10;

        double[] cof2 = new double[6];
        cof2[0] = 19.2;
        cof2[1] = 18.6;
        cof2[2] = 6.3;
        cof2[3] = 10;
        cof2[4] = 31.2;
        cof2[5] = 7.89;

        MyPolynomial pol1 = new MyPolynomial(cof1);
        MyPolynomial pol2 = new MyPolynomial(cof2);
        System.out.println("Polynomal 1 : " + pol1);
        System.out.println("Polynomal 2 : " + pol2);
        System.out.println();
        System.out.println("Degrees: ");
        System.out.println("Polynom 1 has a " + pol1.getDegree() + " degree");
        System.out.println("Polynom 2 has a " + pol2.getDegree() + " degree");
        System.out.println();
        System.out.println("Results with x = 18: ");
        System.out.println("Polynom 1 : " + pol1.Evaluate(18));
        System.out.println("Polynom 2 : " + pol2.Evaluate(18));
        System.out.println();
        System.out.println("Polynom 1 + Polynom 2 = " + pol1.Add(pol2));
        System.out.println("Polynom 1 * Polynom 2 = " + pol1.Multiply(pol2));
        System.out.println();
        System.out.println();

        System.out.println("Task 3: ");
        Container cont = new Container(0,0, 10, 12);
        System.out.println(cont);
        MyBall ball = new MyBall(6, 7, 2, 4, 90);
        System.out.println(ball);
        System.out.println("Ball's start position - (" + ball.getX() + ", " + ball.getY() + ")");
        System.out.println("Ball's horizontal speed : " + ball.getxDelta());
        System.out.println("Ball's vertical speed : " + ball.getyDelta());
        System.out.println("Change horizontal speed...");
        ball.ReflectHorizontal();
        System.out.println("New facts about ball : " + ball);
        for(int i = 0; i < 4; i++){
            if(cont.Collides(ball) == true) {
            System.out.printf("The ball moved from (" + ball.getX() + ", " + ball.getY() + ") ");
            ball.move();
            System.out.println(" to (" + ball.getX() + ", " + ball.getY() + ")");
            }
            else {
                System.out.println("The ball can't move this side");
                break;
            }

            if(cont.Collides(ball) != true) System.out.println("The ball came out of the container");
        }
    }
}
