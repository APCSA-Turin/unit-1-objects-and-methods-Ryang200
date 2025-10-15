public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle2 plot1 = new Rectangle2(150, 200);
        Rectangle2 plot2 = new Rectangle2(125);
        Rectangle2 plot3 = new Rectangle2();

        plot1.setWidth(75);
        plot2.setLength(75);
        plot2.setWidth(75);
        plot3.setWidth(75);

        System.out.println("These three plots requires " + (plot1.calculateArea()+plot2.calculateArea()+plot3.calculateArea()) + " square feet of seed");
    }
}
