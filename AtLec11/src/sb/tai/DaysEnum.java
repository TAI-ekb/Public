package sb.tai;

public enum DaysEnum {
    SUNDAY ("Воскресенье", "Выходной, но завтра на работу"),
    MONDAY ("Понедельник", "Серые будни"),
    TUESDAY ("Вторник", "Серые будни"),
    WENSDAY ("Среда", "Серые будни"),
    THUSRDAY ("Четверг", "Серые будни"),
    FRIDAY ("Пятница", "Скоро конец будням!"),
    SATURDAY ("Суббота", "Самый лучший день!");
    private String title;
    private String title2;
    DaysEnum (String title, String title2) {
        this.title = title;
        this.title2 = title2;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle2() {
        return title2;
    }
}
