package mao.address_to_geo.service.impl;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import mao.address_to_geo.config.BaseConfigurationProperties;
import mao.address_to_geo.entity.Geo;
import mao.address_to_geo.service.AddressToGeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Project name(项目名称)：addressToGeo
 * Package(包名): mao.address_to_geo.service.impl
 * Class(类名): AddressToGeoServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/5
 * Time(创建时间)： 11:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class AddressToGeoServiceImpl implements AddressToGeoService
{

    @Autowired
    private BaseConfigurationProperties baseConfigurationProperties;

    @Override
    public Geo addressToGeo(String address)
    {
        String apiKey = baseConfigurationProperties.getApiKey();
        String url = "https://api.map.baidu.com/geocoding/v3/?address=" + address + "&output=json&ak=" + apiKey;
        String body = HttpRequest.get(url).execute().body();
        JSONObject jsonObject = JSONUtil.parseObj(body);
        JSONObject location = jsonObject.getJSONObject("result").getJSONObject("location");
        //经度
        Double lng = location.getDouble("lng");
        //纬度
        Double lat = location.getDouble("lat");
        return new Geo().setAddress(address).setTime(LocalDateTime.now())
                .setLatitude(lat)
                .setLongitude(lng);
    }
}
