package com.github.sasa;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class sasaTest {
    @org.junit.Test
    public void getType1() throws Exception {
    }

    @Test
    public void getType() throws Exception {

        //Arrange
        sasa triangle = new sasa(a:5 b:10 c:5);

        //Act
        String result =sasa.getType();

        //Assert
        Assert.assertEquals(expected: "不是三角形",result);
    }

}
