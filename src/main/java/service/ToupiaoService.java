package service;

import entity.Toupiao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ToupiaoService {


    //醒找是否同名
    public Toupiao renmin(String uname);

    //更新票数
    public int uppiaosu(@Param("ps") String ps,@Param("uname") String uname);


    public int savePs(String uname);

}
