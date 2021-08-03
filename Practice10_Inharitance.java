package com.company;

//1. & 3.
//class circle{
//    double radius;
//
//    circle (int r){
//        this.radius = r;
//    }
//
//    double area (){
//        double a = 3.14 * radius * radius;
//        return a;
//    }
//}
//class cylinder extends circle{
//    double height;
//
//    cylinder(int r, int h){
//        super(r);
//        this.height = h;
//    }
//
//    double vol(){
//        double a = 3.14 * height * 2 * radius;
//        return a;
//    }
//}


//2. & 4.
class rectangle{
    public int height;
    public int breath;

    rectangle (int h, int b){
        this.breath = b;
        this.height = h;
    }

    int area(){
        int a = height * breath;
        return a;
    }
}

class cuboid extends rectangle{
    public int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    cuboid (int h, int b, int w){
        super(h,b);
        this.width = w;
    }

    int vol(){
        int a = height*width*breath;
        return a;
    }
}




public class Practice10_Inharitance {
    public static void main(String[] args) {
//        1. & 3.
//        circle c = new circle(6);
//        System.out.println(c.area());
//        cylinder r = new cylinder(5,3);
//        System.out.println(r.vol());

//        2.& 4.



    }

}
