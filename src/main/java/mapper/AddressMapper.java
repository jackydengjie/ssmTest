package mapper;

public interface AddressMapper {
    //保存已投票的网卡MAC地址(设置的返回值要以MYSQL的返回值来定，例如insert插入新行的返回值是数值是int所以返回值要用int型)
    public int saveMac(String macaddress);
}
