package mao.address_to_geo.service;

import mao.address_to_geo.entity.Geo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：addressToGeo
 * Package(包名): mao.address_to_geo.service
 * Class(测试类名): AddressToGeoServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/5
 * Time(创建时间)： 11:36
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class AddressToGeoServiceTest
{

    @Autowired
    private AddressToGeoService addressToGeoService;

    @Test
    void addressToGeo()
    {
        //113.3310844896273, latitude=23.112222774059774
        Geo geo = addressToGeoService.addressToGeo("广东省广州市海珠区广州塔");
        System.out.println(geo);
    }

    @Test
    void addressToGeo2()
    {
        //116.4041774131041, latitude=39.9096519665138
        Geo geo = addressToGeoService.addressToGeo("北京市天安门广场");
        System.out.println(geo);
    }

    @Test
    void addressToGeo3()
    {
        //longitude=113.08755916595523, latitude=28.251818487944462
        Geo geo = addressToGeoService.addressToGeo("湖南省长沙市长沙南站");
        System.out.println(geo);
    }
}
