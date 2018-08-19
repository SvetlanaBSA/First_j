public class Task3 {
    public static void main(String[] args){
        /*Имеется промежуток времени в секундах.
        Следует вывести его на страницу используя формат с указанием часов, минут и секунд.*/
        //Дата старта
        int timeSecStart = 2110; //0h 35min 10sec
        //Дата завершения
        int timeSecEnd = 10885; //3h 1min 25sec
        //Проверка на корректность введенных данных
        if (timeSecStart < 0 || timeSecEnd < 0)
            System.out.println("Error: incorrect data.");
        else {
            //Проверка, что дата старта меньше даты завершения
            if (timeSecStart > timeSecEnd)
                System.out.println("Error: start time should be less or equal to end time.");
            else {
                int timeHourStart = timeSecStart / 60 / 60;
                timeSecStart -= timeHourStart * 60 * 60;
                int timeMinStart = timeSecStart / 60;
                timeSecStart -= timeMinStart * 60;
                int timeHourEnd = timeSecEnd / 60 / 60;
                timeSecEnd -= timeHourEnd * 60 * 60;
                int timeMinEnd = timeSecEnd / 60;
                timeSecEnd -= timeMinEnd * 60;
                System.out.println(timeHourStart + "h " + timeMinStart + "min " + timeSecStart + "sec - " + timeHourEnd + "h " + timeMinEnd + "min " + timeSecEnd + "sec");
            }
        }
    }
}
