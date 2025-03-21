public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        String s1 = new String("asd");
        System.out.println(p1.xCoor);
        System.out.println(p1.yCoor);

        Point p2 = new Point(3,4);
        System.out.println(p2.xCoor);
        System.out.println(p2.yCoor);

        Point p3 = new Point(5);
        System.out.println(p3.xCoor);
        System.out.println(p3.yCoor);

        Rectangle r1 = new Rectangle(p3, 4 ,5);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoor);
        System.out.println(r1.getTopLeft().yCoor);

        System.out.println(r1.perimeter());
        System.out.println(r1.area());
    }

}