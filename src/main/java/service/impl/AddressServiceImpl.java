package service.impl;

import mapper.AddressMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import service.AddressService;

import javax.annotation.Resource;

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    @Override
    public int saveMac(@Param("macaddress") String macaddress, @Param("ipaddress") String ipaddress,@Param("cname") String cname) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行saveMac");
        System.out.println("macaddress的值是:"+macaddress);
        System.out.println("ipaddress的值是：" + ipaddress);
        System.out.println("cname的值是："+cname);
        int mac=addressMapper.saveMac(macaddress,ipaddress,cname);
        System.out.println(mac);
        return mac;

    }
}
