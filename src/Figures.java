public class Figures {
    public double rectangleArea(double length,double width){
        return length * width;
    }
    public double squareArea(double length){
        return Math.pow(length,2);
    }
    public double triangleArea(double height,double footing){
        return 0.5 * height * footing;
    }
    public double diamondArea(double diagonal1, double diagonal2){
        return diagonal1 * diagonal2 / 2;
    }
}
