package guru.qa;

public class Main {
    public static void main(String[] args) {
        Product info = new Product();
        info.title = "Шашлык";
        info.id = 10110;
        info.price = 501.11;
        info.getNameProduct();

        info.calculationIntAndDouble();
    }
}
