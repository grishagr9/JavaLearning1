package com.company;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
//int double
    public static void main(String[] args) {
        DateAndTime();
    }

    public static void DateAndTime(){
        //Класс java.time.LocalDate представляет дату без информации о времени
        //Подобным образом класс java.time.LocalTime представляет время без информации о дате
        //Класс java.time.LocalDateTime хранит и дату, и время
        LocalTime a = LocalTime.of(7,15);
        LocalDate localDate = LocalDate.of(2001,3,10);
        System.out.printf("на дворе %tY год, и что теперь?",LocalDate.now());
    }
}