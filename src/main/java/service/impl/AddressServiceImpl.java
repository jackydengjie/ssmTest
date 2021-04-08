package service.impl;

import mapper.AddressMapper;
import org.springframework.stereotype.Service;
import service.AddressService;

import javax.annotation.Resource;

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    @Override
    public int saveMac(String macaddress,String ipaddress) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行saveMac");
        System.out.println("macaddress的值是:"+macaddress);
        System.out.println("ipaddress的值是：" + ipaddress);
        int mac=addressMapper.saveMac(macaddress,ipaddress);
        System.out.println(mac);
        return mac;

    }
}
