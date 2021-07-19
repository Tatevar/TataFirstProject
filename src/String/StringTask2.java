//2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0
package String;

public class StringTask2 {
    public static void main(String[] args) {

        String str = "I think I'm great person, huh!";
        System.out.println("The Old text is" + "\n" + str);
        char zero = str.charAt(0);
        char thirdIndex = str.charAt(3);
        System.out.println("Third index- " + thirdIndex);
        System.out.println("Zero indexс - " + zero);
        String stringValue = str.replace(thirdIndex, zero);
        System.out.println("The New text" + "\n" + stringValue);

    }
}

