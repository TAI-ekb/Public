package sb.tai;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       /* ArrayList<Integer> arrList = new ArrayList<>(10000);
        LinkedList<Integer> linList = new LinkedList<>();
        for (int i = 0; i < 9999 ; i++) {
            arrList.add(generateInt());
            //LinkedList<Integer> linList = new LinkedList<>(10000);
        }*/
        //print1(list);
        String [] surname = {"Микальчук","Говоркян","Лавринович"};
        String [] name = {"Колян","Васёк","Вован"};
        ArrayList<User> all = new ArrayList<>();
        boolean tmp = true;
        while (tmp) {
            int a = generateInt();
            int b = generateInt();
            if (a<3&&b<3) {
                //System.out.println(a);
                User person = new User(surname[a],name[b]);
                //System.out.println(person);
                if (all.contains(person)) {
                    System.out.println(a);
                    tmp = false;
                    print1(all);
                } else {
                    all.add(person);
                }
            }
            else {
                continue;
            }
        }
        print1(all);




        // write your code here
    }
    public static Integer generateInt () {
        return (int) (Math.random() * 10);
    }
    public static void print1 (ArrayList<User> print1) {
        //for (int i = 0; i < print1.size() ; i++) {
            System.out.println(print1.toString());

    }
    /*public static void print2 (ArrayList print2) {
        Iterator <>
        }
    }*/
    /*public static void print1 (ArrayList print1) {
        for (int i = 0; i < 9 ; i++) {
            System.out.println(print1.get(i));
        }*/
    }


