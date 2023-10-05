package mao.address_to_geo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：addressToGeo
 * Package(包名): mao.address_to_geo.config
 * Class(类名): BaseConfigurationProperties
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/5
 * Time(创建时间)： 11:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Component
@ConfigurationProperties("atg")
public class BaseConfigurationProperties
{
    private String apiKey;

    public String getApiKey()
    {
        return apiKey;
    }

    public BaseConfigurationProperties setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        return this;
    }
}
