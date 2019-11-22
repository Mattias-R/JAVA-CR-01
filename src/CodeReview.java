public class CodeReview {
    public static void main(String[] args){
        System.out.println("rechteckfläche " + calculateRectArea(20,30));
        System.out.println("rechteckfläche " + calculateRectArea(40,50));
        System.out.println("rechteckfläche " + calculateRectArea(5,20));
        System.out.println("rechteckfläche " + calculateRectArea(10,20));

        System.out.println("quadratfläche " + calculateSquareArea(4));
        System.out.println("quadratfläche " + calculateSquareArea(2));
        System.out.println("quadratfläche " + calculateSquareArea(3));
        System.out.println("quadratfläche " + calculateSquareArea(5));
        System.out.println("quadratfläche " + calculateSquareArea(6));

        System.out.println("quadratumfang " + calculateSquareParimeter(5));
        System.out.println("quadratumfang " + calculateSquareParimeter(3));
        System.out.println("quadratumfang " + calculateSquareParimeter(4));
        System.out.println("quadratumfang " + calculateSquareParimeter(6));

        System.out.println("rechteckumfang " + calculateRectParimeter(20, 30));
        System.out.println("rechteckumfang " +calculateRectParimeter(5, 20));
        System.out.println("rechteckumfang " +calculateRectParimeter(10, 20));
        System.out.println("rechteckumfang " +calculateRectParimeter(40, 50));

    }
    public static int calculateRectArea(int a, int b){
        return a*b;
    }
    public static int calculateSquareArea(int x){
        return x*x;
    }
    public static int calculateSquareParimeter(int d){return d*4;}
    public static int calculateRectParimeter(int f, int g){return 2*(f+g);}

}
