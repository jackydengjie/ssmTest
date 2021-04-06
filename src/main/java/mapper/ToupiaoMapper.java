package mapper;

import entity.Toupiao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ToupiaoMapper {

    //查找所有用户
    public List<Toupiao> findAll();

    //查找找是否同名
    public Toupiao renmin(String uname);

    //更新票数
    public int uppiaosu(@Param("ps") String ps,@Param("uname") String uname);

    //
    public int savePs(String uname);

    //保存已投票的网卡MAC地址(设置的返回值要以MYSQL的返回值来定，例如insert插入新行的返回值是数值是int所以返回值要用int型)
    public int saveMac(String macaddress);
}
