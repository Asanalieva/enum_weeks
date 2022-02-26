package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             String input = scanner.nextLine();
             switch (Weeks.valueOf(input.toUpperCase(Locale.ROOT))){
                 case ДҮЙШӨНБҮ -> System.out.println("Дуйшомбу куну жава окуйм");
                 case ШЕЙШЕМБИ -> System.out.println("Шейшемби  soft skills абагын окуйм");
                 case ШАРШЕМБИ -> System.out.println("Шаршемби куну жава окуйм");
                 case БЕЙШЕМБИ -> System.out.println("Бейшемби куну англис тили сабагын окуйм");
                 case ЖУМА -> System.out.println("Жума куну жава окуйм");
                 case ИШЕМБИ -> System.out.println("Ишемби эс алам");
                 case ЖЕКШЕМБИ -> System.out.println("Жекшемби күнү эс алам");
             }


    }
}
