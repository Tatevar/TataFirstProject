/*Текстовый файл содержит текст. После запуска
 программы в другой файл должны записаться только
 те предложения в которых от 3-х до 5-ти слов.
  Если в предложении присутствует слово-палиндром,
  то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл.
        Пишем все в ООП стиле. Создаём класс TextFormater
        в котором два статических метода:
        1. Метод принимает строку и возвращает кол-во слов в строке.
        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром.
        Если есть возвращает true, если нет false
        В main считываем файл.
        Разбиваем текст на предложения. Используя методы класса TextFormater
         определяем подходит ли нам предложение. Если подходит добавляем его в новый файл

 */
package String;

import java.util.Scanner;
import java.util.regex.Pattern;


public class TextFormater {


    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Enter a text for check");
        String input = text.nextLine();

        checkIfWordisPalindrome(input);
        System.out.println("++++++++++++++");
        Text1();

    }
    public static void Text1() {
        Scanner text = new Scanner(System.in);
        System.out.println("Enter a text line");
        int count = (int) Pattern.compile("\\W+")
                .splitAsStream(text.nextLine())
                .count();

        if (count <= 5 ) {
            System.out.println("количество слов " + count
                    + "\nдобавляем в файл "  );}
        else{System.out.println("количество слов " + count
                + "\nне добавляем в файл " );}

    }

    public static boolean checkIfWordisPalindrome(String str) {

        StringTask3 str3 = new StringTask3();

        String[] words = str.split("\\s");

        for (String word : words) {

            if (str3.thePalindrome(word) == true) {

                System.out.println(word + " It's palindrome: \n" + str);
                return true;

            }

        }
        System.out.println("In sentence:\n" + str + "\n" +
                "There are not palindromes");
        return false;

    }
}



