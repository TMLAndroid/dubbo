//生成的代理类
public class CarInterface$Adaptive
implements CarInterface {
    public void getColor(URL uRL) {
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string = uRL2.getParameter("car", "red");
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Failed to get extension (com.luban.dubbo_spi.api.CarInterface) name from url (").append(uRL2.toString()).append(") use keys([car])").toString());
        }
        CarInterface carInterface = (CarInterface)ExtensionLoader.getExtensionLoader(CarInterface.class).getExtension(string);
        carInterface.getColor(uRL);
    }
}