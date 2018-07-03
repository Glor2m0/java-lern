/*
 класс реализует калькулятор.
 */

public class Calculator {
    /*
    результаты вычисленияя
     */
    private int result;

    /*
    Суммируем аргументы
            @param parans Аргументы суммирования
     */

    public void add (int ... params) {
        for (Integer param : params) {
            this.result  += param;
        }
    }

/*
    Получить результат вычисления
    @return результат вычисления
*/

    publicint getRsult(){
        return this.result;
    }

/*
    Очистить результат вычисления
*/

    public void cleanResult(){
        this.result = 0;
    }

}