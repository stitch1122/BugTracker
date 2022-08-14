import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static ArrayList<Issue> issueList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    private static final int CONSTANT_ADDBUG = 1;
    private static final int CONSTANT_ADDENHANCEMENT = 2;
    private static final int CONSTANT_SHOWALL = 3;
    private static final int CONSTANT_EXIT = 0;

    public static void main(String[] args) {
        System.out.println("Bug tracker");
        int command;
        do {
            System.out.println("Что вы хотите сделать? 1 - добавить баг, 2 - добавить улучшение, 3 - посмотреть все баги и улучшения, 0 - выход");
            command = scanner.nextInt();
            scanner.nextLine();
            if (command == CONSTANT_ADDBUG) {
                addBugNew();
            } else if (command == CONSTANT_ADDENHANCEMENT) {
                addEnhancementNew();
            } else if (command == CONSTANT_SHOWALL) {
                issueList();
            } else if (command == CONSTANT_EXIT) {
                System.out.println("Программа завершена");
                System.exit(0);
            } else {
                System.out.println("Введите цифру от 0 до 3");
            }
        } while (command != CONSTANT_EXIT);
    }

    public static void addBugNew() {
        System.out.println("Введите название бага: ");
        String title = scanner.nextLine();
        System.out.println("Введите краткое описание бага: ");
        String summary = scanner.nextLine();
        System.out.println("Введите серьезность: ");
        for (Level el : Level.values()) {
            System.out.print(el + " ");
        }
        Level severityLev = readLevel();
        System.out.println("Введите приоритет: ");
        for (Level el : Level.values()) {
            System.out.print(el + " ");
        }
        Level priorityLev = readLevel();
        System.out.println("Введите шаги: ");
        String steps = scanner.nextLine();
        Bug bug = new Bug(title, summary, severityLev, priorityLev, steps);
        issueList.add(bug);
        System.out.println("Новый баг создан: \n" + bug.makeString());
        System.out.println();
    }

    public static void addEnhancementNew() {
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
    }

    public static void issueList() {
        for (Issue el : issueList) {
            System.out.println(el.makeString());
        }
        System.out.println();
    }

    public static Level readLevel() {
        while (true) {
            try {
                String stringLevel = scanner.nextLine();
                return Level.valueOf(stringLevel);
            } catch (IllegalArgumentException e) {
                System.out.println("Вы ввели неправильное значение. Введите значение еще раз");
            }
        }
    }
}