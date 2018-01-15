package CwiczeniaZJavaPodstawyHelion;

/**
 * Created by Kasia on 2017-05-30.
 */

class TwoDShape {
    private double width;
    private double height;
    private String name;

    //Konstruktor domyślny.
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    //Konstruktor z parametrami.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Tworzy obiekt, którego szerokość jest taka sama jak wysokość.
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    //Tworzy obiekt na podstawie innego obiektu.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //Metody dostępowe dla składowych width i height.
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Szerokość i wysokość: " + width + " and " + height);
    }

    double area() {
        System.out.println("area() musi być przesłonięta w klasach pochodnych");
        return 0.0;
    }
}

//KLasa pochodna klasy TwoDShape reprezentująca trójkąty.
class Triangle extends TwoDShape {
    private String style;

    //Konstruktor domyślny.
    Triangle() {
        super();
        style = "nieokreślony;";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "trójkąt"); //wywołanie konstruktora klasy bazowej

        style = s;
    }

    //Konstruktor o jednym parametrze.
    Triangle(double x) {
        super(x, "trójkąt"); //wywołanie konstruktora klasy bazowej

        style = "wypełniony";
    }

    //Tworzy obiekt na podstawie innego obiektu.
    Triangle(Triangle ob) {
        super(ob); //przekazuje obiekt konstruktorowi klasy TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}

//Klasa pochodna klasy bazowej TwoDShape reprezentują prostokąty.
class Rectangle extends TwoDShape {
    Rectangle() {
        super();
    }

    //Konstruktor z parametrami.
    Rectangle(double w, double h) {
        super(w, h, "prostokąt"); //wywołanie konstruktora klasy bazowej
    }

    //Konstruktor o jednym parametrze.
    Rectangle(double x) {
        super(x, "prostokąt"); //wywołanie konstruktora klasy bazowej
    }

    //Tworzy obiekt na podstawie innego obiektu.
    Rectangle(Rectangle ob) {
        super(ob); //przekazuje obiekt konstruktorowi klasy TwoDShape
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) {
            return true;
        }
        return false;
    }

    //Przesłania area() w klasie Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}

/*
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Kolor " + color);
    }
}
*/

public class Shapes6 {
    public static void main(String args[]) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("pusty", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "ogólny");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Typ obiektu: " + shapes[i].getName());
            System.out.println("Powierzchnia wynosi " + shapes[i].area());

            System.out.println();
        }
/*        ColorTriangle t1 = new ColorTriangle("niebieski", "pusty", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("czerwony", "wypełniony", 4.0, 2.0);

        System.out.println("Informacje o t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Powierzchnia wynosi " + t1.area());

        System.out.println();

        System.out.println("Informacje o t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Powierzchnia wynosi " + t2.area());*/
    }
}
