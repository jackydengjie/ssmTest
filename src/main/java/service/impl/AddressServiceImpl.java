package service.impl;

import entity.Address;
import mapper.AddressMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import service.AddressService;

import javax.annotation.Resource;
import java.net.UnknownHostException;

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    @Override
    public int saveMac(@Param("macaddress") String macaddress, @Param("ipaddress") String ipaddress,@Param("cname") String cname) {
        System.out.println("TAddressServiceImpl的saveMac方法执行");
        System.out.println("macaddress的值是:"+macaddress);
        System.out.println("ipaddress的值是：" + ipaddress);
        System.out.println("cname的值是："+cname);
        int mac=addressMapper.saveMac(macaddress,ipaddress,cname);
        System.out.println(mac);
        return mac;

    }

    @Override
    public Address smac(String maca) {
        System.out.println("AddressServiceImpl的smac方法执行");
        Address address=addressMapper.smac(maca);
        System.out.println("address:"+address);
        return address;
    }
}
