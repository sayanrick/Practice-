package com.java;
enum NAME{
    ALIEN,
    ALIEN2,
    STUDENT,
    SAYAN,
    CYBORG
}

public class Switchcase {
    public static void main(String[] args) {
        NAME n = NAME.SAYAN;

        switch (n) {
            case ALIEN -> System.out.println("Switch case is very easy for Alien");
            case ALIEN2 -> System.out.println("Switch case is very easy for Alien2");
            case STUDENT -> System.out.println("Switch case is very easy for Student");
            case SAYAN -> System.out.println("Switch case is very easy for Sayan");
            case CYBORG -> System.out.println("Switch case is very easy for Cyborg");
            default -> System.out.println("Unknown");
        }
    }
}


