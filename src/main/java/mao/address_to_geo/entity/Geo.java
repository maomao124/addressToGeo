package mao.address_to_geo.entity;

import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * Project name(项目名称)：addressToGeo
 * Package(包名): mao.address_to_geo.entity
 * Class(类名): Geo
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/5
 * Time(创建时间)： 11:08
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Geo
{
    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 原始地址
     */
    private String address;


    /**
     * 转换的时间
     */
    private LocalDateTime time;

    public Double getLongitude()
    {
        return longitude;
    }

    public Geo setLongitude(Double longitude)
    {
        this.longitude = longitude;
        return this;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public Geo setLatitude(Double latitude)
    {
        this.latitude = latitude;
        return this;
    }

    public String getAddress()
    {
        return address;
    }

    public Geo setAddress(String address)
    {
        this.address = address;
        return this;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public Geo setTime(LocalDateTime time)
    {
        this.time = time;
        return this;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Geo.class.getSimpleName() + "[", "]")
                .add("longitude=" + longitude)
                .add("latitude=" + latitude)
                .add("address='" + address + "'")
                .add("time=" + time)
                .toString();
    }
}
