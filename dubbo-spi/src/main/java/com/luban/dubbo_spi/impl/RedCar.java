package com.luban.dubbo_spi.impl;

import com.luban.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

public class RedCar implements CarInterface {
    public void getColor(URL url) {
        System.out.println("red");
    }
}
