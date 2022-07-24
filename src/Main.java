import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Bug> bugsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bug tracker");
        Main menu = new Main();
        menu.menu();
    }
    public void menu() {
        System.out.println("Что вы хотите сделать? 1 - добавить баг, 2 - посмотреть все баги, 0 - выход");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a == 1) {
            addBugNew();
        } else if (a == 2) {
            bugsList();
        } else if (a == 0) {
            System.out.println("Программа завершена");
            System.exit(0);
        } else {
            System.out.println("Введите цифру от 0 до 2");
            menu();
        }
    }

    public void addBugNew () {
        Bug bug = new Bug();
        bugsList.add(bug);
        System.out.println("Введите название бага: ");
        bug.title = scanner.nextLine();
        System.out.println("Введите краткое описание бага: ");
        bug.summary = scanner.nextLine();
        System.out.println("Введите серьезность: ");
        bug.severity = scanner.nextLine();
        System.out.println("Введите приоритет: ");
        bug.priority = scanner.nextLine();
        System.out.println("Введите шаги: ");
        bug.steps = scanner.nextLine();
        System.out.println("Новый баг создан: \n" + bug.title + "; " + bug.summary + "; " + bug.severity + "; " + bug.priority + "; " + bug.steps);
        System.out.println();
        menu();
    }
    public void bugsList () {
        for (Bug el : bugsList)
            System.out.println(el.title + "; " + el.summary + "; " + el.severity + "; " + el.priority + "; " + el.steps);
        System.out.println();
        menu();

    }
}