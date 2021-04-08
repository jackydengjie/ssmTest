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
    public int saveMac(String macaddress) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行saveMac");
        System.out.println("macaddress的值是:"+macaddress);
        int mac=addressMapper.saveMac(macaddress);
        System.out.println(mac);
        return mac;

    }
}
