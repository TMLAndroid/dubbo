package com.luban.dubbo_spi.impl;


import com.luban.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

public class BenzCar implements CarInterface {

    private CarInterface carInterface;
    //注入
    public void setCarInterface(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    public void getColor(URL url) {
        System.out.println("我艾克");
        carInterface.getColor(url);
    }
}
