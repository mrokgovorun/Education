package complex;

import megafon.Abonent;
import com.company.Round;

public class Main {

    public static void main(String[] args) {
        //Та самая "фишка"
        //ATTENTION
        //TODO
        //OPTIMIZE
        Round Circus = new Round();
        Circus.setNatX(5);
        Circus.setNatY(3);
        Circus.setRadiusR(10);
        System.out.println("Координата X:" + Circus.getNatX());
        System.out.println("Координата Y:" + Circus.getNatY());
        System.out.println("Радиус равен:" + Circus.getRadiusR());
        System.out.print("Длина окружности равна: ");
        Circus.writeLength();
        System.out.println("Длина окружности, используя метод getLength:" + Circus.getLength());
        Abonent abonent = new Abonent("Адушкин Александр Юрьевич", "Иркутск", "26.11.1990");

        Abonent abonent1 = new Abonent("Мрок Александр Александрович", "Иркутск", "22.07.1987");
        Abonent abonent2;
        abonent2 = new Abonent();
        abonent2.setFio("Андромеда");
        System.out.println(abonent.getFio());
        abonent2.setCity("Irkona");
        abonent2.setDate("23.08.1548");
        abonent.setFio("Black Lion");
        System.out.println(abonent.getFio());
        //TODO Подумать над классом файлридер(поля, методы). Создать каркас.


        MyInt myInt1 = new MyInt();
        myInt1.a = 1;
        MyInt myInt2 = new MyInt();
        myInt2.a = 2;
        Complex complex = new Complex(myInt1.getA(), myInt2.getA());
        int a[] = {1,2,3,4,5,6,7};  // Задаем значения массива. Сразу устанавливается размерность массива.
        int b[] = new int[2];       // Создаем новый массив и устанавливаем его размерность без указания значений.
        b[0] = 1;                   // Присваиваем значение первому элементу массива [0]
        b[1] = 2;                   // ...
    }
}





