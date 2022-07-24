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
        System.out.println("��� �� ������ �������? 1 - �������� ���, 2 - ���������� ��� ����, 0 - �����");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a == 1) {
            addBugNew();
        } else if (a == 2) {
            bugsList();
        } else if (a == 0) {
            System.out.println("��������� ���������");
            System.exit(0);
        } else {
            System.out.println("������� ����� �� 0 �� 2");
            menu();
        }
    }

    public void addBugNew () {
        Bug bug = new Bug();
        bugsList.add(bug);
        System.out.println("������� �������� ����: ");
        bug.title = scanner.nextLine();
        System.out.println("������� ������� �������� ����: ");
        bug.summary = scanner.nextLine();
        System.out.println("������� �����������: ");
        bug.severity = scanner.nextLine();
        System.out.println("������� ���������: ");
        bug.priority = scanner.nextLine();
        System.out.println("������� ����: ");
        bug.steps = scanner.nextLine();
        System.out.println("����� ��� ������: \n" + bug.title + "; " + bug.summary + "; " + bug.severity + "; " + bug.priority + "; " + bug.steps);
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