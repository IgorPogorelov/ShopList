import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        List<String> list = new ArrayList<>();

        while (true) {

            System.out.println("Выберите операцию: 1. Добавить 2. Показать 3. Удалить 4. Найти");
            Scanner scanner = new Scanner(System.in);
            String numberOperation = scanner.nextLine();

            if (numberOperation.equals("1")) {
                System.out.println("Какую покупку хотите добавить?");
                String purchase = scanner.nextLine();
                list.add(purchase);
                count++;
                System.out.println("Итого в списке покупок: " + count);
            } else if (numberOperation.equals("2")) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
            } else if (numberOperation.equals("3")) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название:");
                String nameOrNumberOperation = scanner.nextLine();

                for (int i = 0; i < list.size(); i++) {
                    if (nameOrNumberOperation.equals(list.get(i))) {
                        list.remove(i);
                        count--;
                        System.out.println("Покупка " + "\"" + nameOrNumberOperation + "\"" + " удалена, список покупок:");
                        for (int y = 0; y < list.size(); y++) {
                            System.out.println((y + 1) + " " + list.get(y));
                        }
                        break;
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    String iToString = Integer.toString(i + 1);
                    if (nameOrNumberOperation.equals(iToString)) {
                        list.remove(i);
                        count--;
                        System.out.println("Покупка " + "\"" + iToString + "\"" + " удалена, список покупок:");
                        for (int y = 0; y < list.size(); y++) {
                            System.out.println((y + 1) + " " + list.get(y));
                        }
                        break;
                    }
                }
            } else if (numberOperation.equals("4")) {
                System.out.println("Введите текст для поиска:");
                String textForFinder = scanner.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).toLowerCase().contains(textForFinder.toLowerCase())) {
                        System.out.println((i + 1) + " " + list.get(i));
                    }
                }
            }
        }
    }
}
