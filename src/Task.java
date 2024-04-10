import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст первого человека");
        byte firstAge = sc.nextByte();
        System.out.println("Введите возраст второго человека");
        byte secondAge = sc.nextByte();
        byte differenceOfAges = getAgeDiff(firstAge, secondAge);
        System.out.println("Разница в возрасте " + differenceOfAges + " года/лет");
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}
