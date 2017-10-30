import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Для того чтобы файл читался надо сохранить его в UTF-8
 */
public class Zadanie_6 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileAddres = "D:\\nabor_slov.txt";//указываем откуда брать файл

        Scanner scanner = new Scanner(new File(fileAddres)); // прочитали файл , Файл должен быть в формате UTF-8

        System.out.println("Выводим список всех слов :");

        LinkedList<String> spisok = new LinkedList<String>(); //создали список типа List

        while (scanner.hasNext()) {
            String sborSlov;
            sborSlov = scanner.next();
            spisok.add(sborSlov);
        }
        System.out.println("Слова из файла : " + spisok);

        Collections.sort(spisok);//сортируем список в алфавитном порядке
        System.out.println("Отсортированный список слов  ---\n" + spisok); //выводим отсортированный список на консоль
        String[] massiv = spisok.toArray(new String[spisok.size()]);        //переводим в массив

        //считаем сколько раз у нас каждое слово встречается в массиве
        Scanner sc = new Scanner(new File("D:\\nabor_slov.txt"));
        Map<String, Integer> statistics = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String word = sc.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println("Статистика по словам " + statistics);

        int maxValueInMap = (Collections.max(statistics.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Слово с максимальным количеством повторений : " + entry.getKey() +
                        "  Количество повторений = " + entry.getValue());     // Выводим значение максимального повтореняющегося слова и сколько раз оно выведено
            }
        }
        scanner.close();
    }


}

