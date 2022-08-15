package guru.qa;

public class Product {
    int id;
    double price;
    String title;

    void getNameProduct() {
        if (id == 10110) {
            System.out.println(title + " " + price + " руб.");
        } else {
            System.out.println("Товар не найден! Обратитесь к продавцу");
        }
    }
    //вычисления комбинаций типов данных (int и double)
    void calculationIntAndDouble() {
        System.out.println();
        System.out.println(id+price);
        System.out.println(id-price);
        System.out.println(id*price);
        System.out.println(id/price);
    }
}
