public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("\nCircle with normal border");
        circle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();

        System.out.println("\nRectangle with normal border");
        rectangle.draw();
    }
}
