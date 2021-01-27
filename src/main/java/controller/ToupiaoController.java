package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ToupiaoService;

import javax.annotation.Resource;

@Controller
public class ToupiaoController {
    public ToupiaoService getToupiaoService() {
        return toupiaoService;
    }

    public void setToupiaoService(ToupiaoService toupiaoService) {
        this.toupiaoService = toupiaoService;
    }

    @Resource
    private ToupiaoService toupiaoService;

    @RequestMapping("/toSavePs")
    @ResponseBody
    public String savePs(String uname,Model model){
        System.out.println("ToupiaoController的savePs方法执行");
        String fanhuei = toupiaoService.savePs(uname);
        System.out.println("fanhuei值是"+fanhuei);
        if (fanhuei==null){
            System.out.println("执行返回值为NULL");
            return "toSavePs";
        }else {
            //model.addAttribute("fanhuei",fanhuei);
            //System.out.println("model = " + model);
            return fanhuei;
        }

    }
}
