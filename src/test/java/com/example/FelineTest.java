package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class) //
public class FelineTest {
    @Mock
    Feline feline;
    @Test
    public void eatMeat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("проверка1", "проверка2"));
        var cat = new Cat(feline);
        assertEquals(List.of("проверка1", "проверка2"), cat.getFood());
       /*Feline feline = new Feline();
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertTrue(Objects.equals(feline.eatMeat(), food));
      */
    }
   @Test
    public void getFamily() {
       Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
       assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }
}