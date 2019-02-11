package secondGraph;

import firstGraph.Ball;
import firstGraph.Circle;
import firstGraph.Cube;
import firstGraph.Rectangle;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        return area;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {

        //wzor Herona
        // P = sqrt( p * (p-a) * (p-b) * (p-c)
        //gdzie p = (a + b + c)/2

        return 0;
    }

    @Override
    public double ballVolume(Ball ball) {
        double volume = 4 * Math.PI * Math.pow(ball.getRadius(), 2);
        return volume;
    }

    @Override
    public double cubeVolume(Cube cube) {

        //kostka
        //pole =>
        return 0;
    }
}