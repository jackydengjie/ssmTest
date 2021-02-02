package mapper;

import entity.Toupiao;

import java.util.List;

public interface ToupiaoMapper {

    //查找所有用户
    public List<Toupiao> findAll();

    //醒找是否同名
    public Toupiao renmin(String uname);

    //更新票数
    public int uppiaosu(int ps,String uname);

    //
    public int savePs(String uname);
}
