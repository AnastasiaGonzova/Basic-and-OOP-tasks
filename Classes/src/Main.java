import MyFigures.Point;
import MyFigures.Triangle;
import Others.Books.Autor;
import Others.Books.Book;
import Others.Employee;
import geometric.Circle;
import geometric.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(12.2, "green");
        Circle circle3 = new Circle(1);
        System.out.println("Circle 1 : " + circle1);
        System.out.println("Circle 2 : " + circle2);
        System.out.println("Circle 3 : " + circle3);
        System.out.println();
        System.out.println("Equals: ");
        System.out.println("circle 1 = circle 2 - is " + circle1.equals(circle2));
        System.out.println("circle 1 = circle 3 - is " + circle1.equals(circle3));
        System.out.println("circle 2 = circle 3 - is " + circle2.equals(circle3));
        circle3.setRadius(15.2);
        circle3.setColor("blue");
        System.out.println();
        System.out.println("Change circle 3...");
        System.out.println("New circle 3 : " + circle3);
        System.out.println();
        System.out.println("Circle1's area = " + circle1.getArea());
        System.out.println("Circle2's area = " + circle2.getArea());
        System.out.println("Circle3's area = " + circle3.getArea());
        System.out.println();
        System.out.println();


        System.out.println("Task 2: ");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(2.5f, 5.4f);
        System.out.println("Rectangle 1 : " + rect1);
        System.out.println("Rectangle 2 : " + rect2);
        System.out.println();
        System.out.println("rectangle 1 = rectangle 2 - is " + rect1.equals(rect2));
        System.out.println("Change rectangle 1...");
        rect1.setLength(3.6f);
        rect1.setWidth(7.8f);
        System.out.println("New rectangle 1 : " + rect1);
        System.out.println("Rect1's area = " + rect1.getArea());
        System.out.println("Rect2's perimeter = " + rect2.getPerimeter());
        System.out.println();
        System.out.println();


        System.out.println("Task 3: ");
        Employee emp1 = new Employee(35, "Ivan", "Ivanov", 15000);
        Employee emp2 = new Employee(46, "Petya", "Petrov", 20000);
        Employee emp3 = new Employee(35, "Ivan", "Ivanov", 15000);
        System.out.println("Equals: ");
        System.out.println("employee 1 = employee 2 - is " + emp1.equals(emp2));
        System.out.println("employee 1 = employee 3 - is " + emp1.equals(emp3));
        System.out.println("employee 2 = employee 3 - is " + emp2.equals(emp3));
        System.out.println();
        System.out.println("Change employee3's salary...");
        emp3.setSalary(50000);
        System.out.println("New facts about employee 3 : " + emp3);
        System.out.println();
        System.out.println("Employee2's annual salary = " + emp2.getAnnualSalary());
        System.out.println();
        System.out.println("Raise employee1's salary...");
        int newSal = emp1.raiseSalary(15);
        emp1.setSalary(newSal);
        System.out.println("New facts about employee 1 : " + emp1);
        System.out.println();
        System.out.println();


        System.out.println("Task 4: ");
        Autor aut1 = new Autor("John", "Smith", "jsm@gmail.com", 'm');
        Book book1 = new Book("My story", 15.99, aut1);
        Autor[] autors = new Autor[3];
        autors[0] = new Autor("Ivan", "Ivanov", "ii@mail.ru", 'm');
        autors[1] = new Autor("Larisa", "Krysa", "lk@mail.ru", 'f');
        autors[2] = new Autor("Dima", "Diman", "dd@mail.ru", 'm');
        Book book2 = new Book("We tried", 19.99, 15, autors);
        System.out.println("Book 1 : " + book1);
        System.out.println("Book 2 : " + book2);
        System.out.println();
        System.out.println("Change information about book 1...");
        book1.setPrice(20.99);
        book1.setQty(15);
        System.out.println("New facts about book 1 : " + book1);
        System.out.println("Book2's autors: " + book2.getAutorsNames());
        System.out.println();
        System.out.println();


        System.out.println("Task 5: ");
        Point point1 = new Point();
        Point point2 = new Point(5,7);
        System.out.println("Point 1 : " + point1);
        System.out.println("Point 2 : " + point2);
        System.out.println();
        System.out.println("point 1 = point 2 - is " + point1.equals(point2));
        System.out.println();
        System.out.println("Old point1's coordinates : ");
        int[] xy1 = point1.getXY();
        for(int i = 0; i < 2; i++){
            System.out.printf(xy1[i] + ", ");
        }
        System.out.println();
        System.out.println("Change point 1...");
        point1.setXY(8, 6);
        System.out.println("New point 1 : " + point1);
        System.out.println("Old point2's coordinates : ");
        int[] xy2 = point2.getXY();
        for(int i = 0; i < 2; i++){
            System.out.printf(xy2[i] + ", ");
        }
        System.out.println();
        System.out.println("Change point 2...");
        point2.setX(7);
        point2.setY(9);
        System.out.println("New point 2 : " + point2);
        System.out.println();
        System.out.println("Distances: ");
        System.out.println("Distance from point of origin to point 1 = " + point1.distance());
        System.out.println("Distance from point 2 to point (14, 16) = " + point2.distance(14,16));
        System.out.println("Distance from point 1 to point 2 = " + point1.distance(point2));
        System.out.println();
        System.out.println();


        System.out.println("Task 6: ");
        Point point3 = new Point(2,4);
        Triangle tri1 = new Triangle(point1, point2, point3);
        Triangle tri2 = new Triangle(2,9,4,8,5,7);
        System.out.println("Triangle 1 : " + tri1);
        System.out.println("Triangle 2 : " + tri2);
        System.out.println();
        System.out.println("triangle 1 = triangle 2 - is " + tri1.equals(tri2));
        System.out.println();
        System.out.println("Perimeteres: ");
        System.out.println("Triangle1's perimeter = " + tri1.getPerimeter());
        System.out.println("Triangle2's perimeter = " + tri2.getPerimeter());
        System.out.println("Types: ");
        System.out.println("Triangle 1 is " + tri1.getType());
        System.out.println("Triangle 2 is " + tri2.getType());

    }
}
