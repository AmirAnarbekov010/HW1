import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Обьявление перменной
        String myName;
        //Задать значение переменной
        final int NUM = 23;
        String word = "apple";
        //конкатенация перемнной NUM и word "конкотенация это обьеденение двух или более строк"
        myName = NUM + word;

        //напечатание всех переменных в одну строку
        System.out.println(myName + ";" + NUM + ";" + word);

        //Условные канструкций(if,if-else,if-else-if-else,switch)
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицтельное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else System.out.println("Вы сохранили ноль");

        //Для введение пользователем в консоль применяется класс Scanner(System.in)"Класс Scanner служит для считывание разнообразных данных данных"
        Scanner scanner = new Scanner(System.in);//System.in сообщает программе, что она должна считывать данные, введенные пользователем с клавиатуры.
        System.out.println("Введите саое имя: ");
        String name = scanner.nextLine();//nextLine() означает прочитой то что написал пользователь до таго как он нажал на ENTER
        System.out.println("Добро пожаловать: " + name);


    }
}