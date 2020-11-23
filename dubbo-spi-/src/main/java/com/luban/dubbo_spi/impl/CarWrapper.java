package com.luban.dubbo_spi.impl;

import com.luban.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

public class CarWrapper implements CarInterface {

    private CarInterface carInterface;

    public CarWrapper(CarInterface carInterface) {
        this.carInterface = carInterface;
    }


    public void getColor(URL url) {
        System.out.println("before");
        carInterface.getColor(url);
        System.out.println("after");
    }
}
