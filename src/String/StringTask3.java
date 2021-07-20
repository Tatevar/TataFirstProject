package String;

public class StringTask3 {
    public static void main(String[] args) {
        StringTask3 str3 = new StringTask3();
        StringBuilder str = new StringBuilder();
        String[] initialText = {"Мам", "Пап", "Дед", "Кот", "Собака", "Лед!", "Дом", "724819"};
        System.out.println("initial file : ");

        for (String firstText : initialText) {
            System.out.print(firstText + " ");
        }

        for (String firstText : initialText) {
            if (str3.thePalindrome(firstText) == true)
                str.append(firstText + " ").toString();
        }

        System.out.println("\nAll the palidromes in a file" + "\n" + str);
    }

        public boolean thePalindrome(String str){
        StringBuilder reverse =  new StringBuilder(str).reverse();
        String revThis = reverse.toString();

        if (str.equalsIgnoreCase(revThis)) {
            return true;
        }
            else{
                return false;
            }
        }

    }



//В исходном файле находятся слова, каждое слово на новой
// стороке. После запуска программы должен создать файл,
// который будет содержать в себе только полиндромы


