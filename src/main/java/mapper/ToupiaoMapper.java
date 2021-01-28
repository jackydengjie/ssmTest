package mapper;

import entity.Toupiao;

import java.util.List;

public interface ToupiaoMapper {

    public List<Toupiao> findAll();



    public int savePs(String uname);
}
