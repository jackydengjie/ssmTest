package controller;

import entity.Toupiao;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ToupiaoService;
import util.GetMACAddress;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.net.*;

import java.util.Map;


@Controller
public class ToupiaoController {


    @Resource
    private ToupiaoService toupiaoService;

    @RequestMapping(value = "/toSavePs",method = RequestMethod.POST)
    public String savePs(String uname, HttpServletRequest request){
        System.out.println("ToupiaoController的savePs方法执行");
        System.out.println("uname的值是："+uname);
        int fanhuei = toupiaoService.savePs(uname);
        String zhi=Integer.toString(fanhuei);
        System.out.println("fanhuei值是"+fanhuei);
        System.out.println("zhi值是:"+zhi);
        if (zhi.equals(0)){
            System.out.println("执行返回值为NULL");
            return zhi;
        }else {
            //model.addAttribute("fanhuei",fanhuei);
            //System.out.println("model = " + model);
            request.setAttribute("zhi",zhi);
            return "toSavePs";
        }

    }

    @RequestMapping(value = "/savePs",method = RequestMethod.POST)
    public String save(String uname,HttpServletRequest request){
        System.out.println("ToupiaoController的save方法执行");
        System.out.println("uname的值是："+uname);
        Toupiao toupiao=toupiaoService.renmin(uname);
        if (toupiao==null){
            int fanhuei = toupiaoService.savePs(uname);
            String zhi=Integer.toString(fanhuei);
            System.out.println("fanhuei值是"+fanhuei);
            System.out.println("zhi值是:"+zhi);
            if (zhi.equals(0)){
                System.out.println("执行返回值为NULL");
                return "错误";
            }else {
                request.setAttribute("zhi",zhi);
                return "savePs";
            }
        }else {
            int i=toupiao.getPiaoshu()+1;
            System.out.println("i值是:"+i);
            String q=Integer.toString(i);
            int fanhuei=toupiaoService.uppiaosu(q,toupiao.getUanme());
            if (fanhuei==0){
                System.out.println("执行返回值为NULL");
                return "错误";
            }else {
                String zhi=Integer.toString(fanhuei);
                System.out.println("fanhuei值是"+fanhuei);
                System.out.println("zhi值是:"+zhi);
                request.setAttribute("zhi",zhi);
                return "savePs";
            }

        }

    }

    @RequestMapping(path = "/getUser",method = RequestMethod.POST)
    @ResponseBody
    public String getUser(@RequestParam Map map,HttpServletRequest request){
        System.out.println("ToupiaoController的save方法执行");
        for (Object map1:map.values()
             ) {
            System.out.println("map1的值是："+map1);
            if(map1!=""){
                String uname=(String)(map1);
                System.out.println("uname的值是："+uname);
                Toupiao toupiao=toupiaoService.renmin(uname);
                if (toupiao==null){
                    System.out.println("没查找到同名");
                    int fanhuei = toupiaoService.savePs(uname);
                    String zhi=Integer.toString(fanhuei);
                    System.out.println("fanhuei值是"+fanhuei);
                    System.out.println("zhi值是:"+zhi);
                    if (zhi.equals(0)){
                        System.out.println("执行返回值为NULL");
                        return "错误";
                    }else {
                        request.setAttribute("zhi",zhi);
                        /*return "savePs";*/
                    }
                }else {
                    int i=toupiao.getPiaoshu()+1;
                    System.out.println("i值是:"+i);
                    String q=Integer.toString(i);
                    int fanhuei=toupiaoService.uppiaosu(q,toupiao.getUanme());
                    if (fanhuei==0){
                        System.out.println("执行返回值为NULL");
                        return "错误";
                    }else {
                        String zhi=Integer.toString(fanhuei);
                        System.out.println("fanhuei值是"+fanhuei);
                        System.out.println("zhi值是:"+zhi);
                        request.setAttribute("zhi",zhi);
                        /*return "savePs";*/
                    }

                }
            }else if(map1!=null){
                System.out.println("map1的值为null");
                System.out.println("map1的值为null");
                System.out.println("map1的值为null");
                System.out.println("map1的值为null");
                System.out.println("map1的值为null");

            }
        }
        return "getUser";
    }




}
