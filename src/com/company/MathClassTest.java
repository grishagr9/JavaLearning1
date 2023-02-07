package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MathClassTest {
    MathClass mathClass = new MathClass();
    @Disabled
    @Test
    @DisplayName("периметр и сторона")
    void task1() {
        assertEquals(mathClass.Task1(4,14),3);
        assertEquals(mathClass.Task1(7.5,32),8.5);
    }

    @Disabled
    @Test
    @DisplayName("катеты и гипотенуза")
    void task2() {
        assertEquals(mathClass.Task2(3,4),17);
        assertEquals(mathClass.Task2(6,8),34);
    }

    @Disabled
    @Test
    @DisplayName("задача про конфеты")
    public void testString() {
        assertEquals(mathClass.Task3(0.5,4.5,25.74,105.3),2.2);
    }

    @Disabled
    @Test
    @DisplayName("линейное уравнени")
    public void task4() {
        assertEquals(mathClass.Task4(-2,-14),-7);
        assertEquals(mathClass.Task4(30,90),3);
    }

    @Disabled
    @Test
    @DisplayName("машины")
    public void task5() {
        assertEquals(mathClass.Task5(70,80,1,100),250);
        assertEquals(mathClass.Task5(60,70,3,180),570);
    }

    @Disabled
    @Test
    @DisplayName("температура")
    public void task6() {
        assertEquals(mathClass.Task6(66.05),18.92);
        assertEquals(mathClass.Task6(97.63),36.46);
    }
}