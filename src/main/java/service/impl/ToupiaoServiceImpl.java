package service.impl;


import entity.Toupiao;
import mapper.ToupiaoMapper;
import org.springframework.stereotype.Service;
import service.ToupiaoService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToupiaoServiceImpl implements ToupiaoService {

    @Resource
    private ToupiaoMapper toupiaoMapper;


    @Override
    public Toupiao renmin(String uname) {
        System.out.println("ToupiaoServiceImpl的renmin方法");
        Toupiao toupiao = toupiaoMapper.renmin(uname);
        return toupiao;
    }

    @Override
    public int uppiaosu(int ps, String uname) {
        System.out.println("ToupiaoServiceImpl的uppiaosu方法");
        int i = toupiaoMapper.uppiaosu(ps,uname);
        return i;
    }


    @Override
    public int savePs(String uname) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行savePs");
        System.out.println("uname的值是："+uname);
        int i =toupiaoMapper.savePs(uname);
        return i;
    }
}
