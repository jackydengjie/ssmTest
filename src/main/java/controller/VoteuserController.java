package controller;

import entity.Voteuser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.VoteuserService;
import service.impl.VoteuserServiceImpl;

import javax.annotation.Resource;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

@Controller
public class VoteuserController {

    @Resource
    private VoteuserService voteuserService;

    @RequestMapping("/index")
    public String toIndedx(Model model){
        System.out.println("进入CONTROLLER方法");
        List<Voteuser> list= voteuserService.findAll();
        System.out.println(list);
        model.addAttribute("list", list);
        System.out.println("model = " + model);
        return "index";


    }

}
