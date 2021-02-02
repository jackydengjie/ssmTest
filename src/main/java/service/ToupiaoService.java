package service;

import entity.Toupiao;

import java.util.List;

public interface ToupiaoService {


    //醒找是否同名
    public Toupiao renmin(String uname);

    //更新票数
    public int uppiaosu(int ps,String uname);


    public int savePs(String uname);

}
