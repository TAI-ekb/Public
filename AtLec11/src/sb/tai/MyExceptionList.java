package sb.tai;

public class MyExceptionList extends Exception {
    private String code;
    public MyExceptionList(String code, Throwable e) {
        super(e);
        this.code = code;
        //System.out.println(ExceptionEnum.valueOf(code).getTitle() + " - " + ExceptionEnum.valueOf(code).getTitle2());

    }

    public String getCode() {
        return this.code;
    }
}
