package service;

import org.apache.ibatis.annotations.Param;

public interface AddressService {
    //保存已投票的网卡MAC地址
    public int saveMac(@Param("macaddress") String macaddress, @Param("ipaddress") String ipaddress,@Param("cname") String cname);
}
