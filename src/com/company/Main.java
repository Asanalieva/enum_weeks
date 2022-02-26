package com.company;

public class Main {

    public static void main(String[] args) {
             Weeks weeks = Weeks.SUNDAY;

             switch (weeks){
                 case Monday -> System.out.println("Дуйшомбу куну жава окуйм");
                 case TUESDAY -> System.out.println("Шейшемби  soft skills абагын окуйм");
                 case WEDNESDAY -> System.out.println("Шаршемби куну жава окуйм");
                 case THURSDAY -> System.out.println("Бейшемби куну англис тили сабагын окуйм");
                 case FRIDAY -> System.out.println("Жума куну жава окуйм");
                 case SATURDAY -> System.out.println("Ишемби эс алам");
                 case SUNDAY -> System.out.println("Жекшемби күнү эс алам");
             }


    }
}
