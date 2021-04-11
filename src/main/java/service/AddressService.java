package service;

import entity.Address;
import org.apache.ibatis.annotations.Param;

import java.net.UnknownHostException;

public interface AddressService {
    //保存已投票的网卡MAC地址
    public int saveMac(@Param("macaddress") String macaddress, @Param("ipaddress") String ipaddress,@Param("cname") String cname);

    //查找是否有相同的mac地址
    public Address smac(String maca) throws UnknownHostException;

}
