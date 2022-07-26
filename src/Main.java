import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public ArrayList<Issue> issueList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bug tracker");
        Main menu = new Main();
        menu.menu();
    }

    public void menu() {
        System.out.println("Что вы хотите сделать? 1 - добавить баг, 2 - добавить улучшение, 3 - посмотреть все баги, 0 - выход");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a == 1) {
            addBugNew();
        } else if (a ==2) {
            addEnhancementNew();
        } else if (a == 3) {
            issueList();
        } else if (a == 0) {
            System.out.println("Программа завершена");
            System.exit(0);
        } else {
            System.out.println("Введите цифру от 0 до 3");
            menu();
        }
    }

    public void addBugNew () {
        System.out.println("Введите название бага: ");
        String title = scanner.nextLine();
        System.out.println("Введите краткое описание бага: ");
        String summary = scanner.nextLine();
        System.out.println("Введите серьезность: ");
        String severity = scanner.nextLine();
        System.out.println("Введите приоритет: ");
        String priority = scanner.nextLine();
        System.out.println("Введите шаги: ");
        String steps = scanner.nextLine();
        Bug bug = new Bug(title, summary, severity, priority, steps);
        issueList.add(bug);
        System.out.println("Новый баг создан: \n" + bug.makeString());
        System.out.println();
        menu();
    }

    public void addEnhancementNew() {
        System.out.println("Введите название улучшения: ");
        String title = scanner.nextLine();
        System.out.println("Введите краткое описание улучшения: ");
        String summary = scanner.nextLine();
        System.out.println("Введите сумму пожертвования: ");
        String donation = scanner.nextLine();
        Enhancement enhancement = new Enhancement(title, summary, donation);
        issueList.add(enhancement);
        System.out.println("Новое улучшение создано: \n" + enhancement.makeString());
        System.out.println();
        menu();
    }

    public void issueList () {
        for (Issue el : issueList) {
            System.out.println(el.makeString());
        }
        System.out.println();
        menu();
    }
}