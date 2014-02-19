package procedure;
import java.io.*;

public class Main {

    public static void main(String[] args){
        // Матрица - это прямоугольная таблица чисел содержащая n число строк и m столбцов,
        // одинаковой длины в каждом случае.

        // Массив. Размерность массива - количество направлений от начального значения.
        // Например шахматы это двумерный массив. А кубик-рубика - трехмерный.

        // Во всем массиве возможен только один тип значений.

        int month_days[];          // Объявление массива. Значение пока равно null
        month_days = new int[12];  // Резервируем память


        // TODO Выведите на экран первые N членов последовательности Фибоначчи.

        // 0 1 1 2 3 5 8 13 21 34 Пример начала последовательности Фиббоначчи.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String Count = "";
        try {
            Count = bufferedReader.readLine();
        } catch (IOException e) {

            e.printStackTrace();
        }
        int N = Integer.parseInt(Count);
        int counting[] = fibbon(N);
        for(int i = 0 ; i < N; i++)
        {
            System.out.println(counting[i]);
        }

    }
    public static int[] fibbon(int F)
    {
        if(F == 1)
        {
            int[] Z = new int[1];              // Создание и определение его размера
            Z[0] = 0;                     // Присвоение значения первой ячейке массива(0)
            return Z;
        }
        if(F >= 2)
        {
            int Z[] = new int[F];
            Z[0] = 0;
            Z[1] = 1;
            if(F == 2)
            {
                return Z;
            }
            else
            {
                for(int i = 2; i < F; i++)
                    Z[i] = Z[i - 1] + Z[i - 2];
                return Z;
            }
        }
        return null;
    }
}

