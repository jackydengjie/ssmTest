package service.impl;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import entity.Toupiao;
import mapper.ToupiaoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import service.ToupiaoService;

import javax.annotation.Resource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

@Service
public class ToupiaoServiceImpl implements ToupiaoService {

    @Resource
    private ToupiaoMapper toupiaoMapper;


    @Override
    public Toupiao renmin(String uname) {
        System.out.println("ToupiaoServiceImpl的renmin方法");
        Toupiao toupiao = toupiaoMapper.renmin(uname);
        System.out.println("toupiao = " + toupiao);
        return toupiao;
    }

    @Override
    public int uppiaosu(@Param("ps") String ps,@Param("uname") String uname) {
        System.out.println("ToupiaoServiceImpl的uppiaosu方法");
        System.out.println("ps的值是："+ps);
        System.out.println("uname的值是："+uname);
        int i = toupiaoMapper.uppiaosu(ps,uname);
        System.out.println("i的值是："+i);
        return i;
    }


    @Override
    public int savePs(String uname) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行savePs");
        System.out.println("uname的值是："+uname);
        int i =toupiaoMapper.savePs(uname);
        return i;
    }

    @Override
    public int saveMac(String macaddress) {
        System.out.println("ToupiaoServiceImpl的savePs方法执行saveMac");
        System.out.println("macaddress的值是:"+macaddress);
        int mac=toupiaoMapper.saveMac(macaddress);
        System.out.println(mac);
        return mac;

    }


}
