package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int number1=20;
        int number2=20;

        int result = number1+number2;
/*
        Assert.assertEquals(0, result);*/

        //Bien, khai bao bien
        //Toan tu
        //Bieu thuc so hoc
        //Bieu thuc logic
        //Bieu thuc dk

        int[] arrNumber = {1,2,43,5,6,67,7,8,89,9,90};

        int n3 = arrNumber[2];
        
        //vong lap for voi array
        for(int a:arrNumber)
        {
            System.out.println(a);
        }


        ArrayList<Integer> arrNumber2 = new ArrayList<>();
        arrNumber2.add(78);

        int n = arrNumber2.get(0);

        int lenght = arrNumber2.size();

    }
}

