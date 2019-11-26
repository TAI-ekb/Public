package sb.tai;

public class User {
    private String surname1;
    private String name1;
    public User (String surname, String name) {
        this.surname1 = surname;
        this.name1 = name;

    }
    public String toString () {
        String s = this.surname1 +" "+ this.name1;
        return s;
    }
    public boolean equals (User user) {
        return surname1.equals(user.surname1)&&name1.equals(user.name1);
    }

}
