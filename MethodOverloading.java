package Day5;
class Calculator{
    float area(int a, float b){
        return a*b;
    }
    double area(double a, double b){
        return a*b;
    }
}
public class MethodOverloading{
    public static void main(String [] args){
        int a=10,b=30;
        Calculator cal=new Calculator();
        System.out.println(cal.area(a,b));
    }
}