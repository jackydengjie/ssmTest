package service.impl;


import entity.Toupiao;
import mapper.ToupiaoMapper;
import org.springframework.stereotype.Service;
import service.ToupiaoService;

import javax.annotation.Resource;

@Service
public class ToupiaoServiceImpl implements ToupiaoService {

    @Resource
    private ToupiaoMapper toupiaoMapper;


    @Override
    public int savePs(String uname) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行savePs");
        int i =toupiaoMapper.savePs(uname);
        return i;
    }
}
