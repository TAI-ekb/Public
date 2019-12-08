package sb.tai;

public enum ExceptionEnum {
    e1 ("Ошибка - Налпоинтер", "Введите заново"),
    e2 ("Ошибка - Класс каст", "Введите заново"),
    e3 ("Ошибка - Намбер формат", "Введите заново");
    private String title;
    private String title2;
    ExceptionEnum (String title, String title2) {
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
