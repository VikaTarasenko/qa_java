package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) //
public class LionTest {

    private final String sex;
    private final boolean expectedResult;
   @Mock
   Lion lion;
    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    public LionTest(String sex, boolean expectedResult) { //создаем конструктор класса, который принимает параметры из Object
        this.sex = sex;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters(name = "Sex = {0}, boolean = {1}")
    public static Object[][] params(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}

        };
    }

    @Test
    public void LionTest() throws Exception {
        Feline feline = new Feline();
        lion = new Lion(sex, feline);
        assertEquals(expectedResult, lion.hasMane);
    }


}
