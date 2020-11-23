package com.luban.dubbo_spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("red")
public interface CarInterface {

    @Adaptive("car")
    void getColor(URL url);
}
