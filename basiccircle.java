public class CircleBasic { 
double radius = 10.5;

double getArea(){
double area = 0;
area = 3.14 *radius* radius; 
return area;
}

public static void main(String[] args){
CircleBasic cb = new CircleBasic();

 double area = cb.getArea();
System.out.println("Area is " + area);
}

}