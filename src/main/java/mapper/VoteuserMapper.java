package mapper;

import entity.Voteuser;

import java.util.List;

public interface VoteuserMapper {

    //列出所有用户
    public List<Voteuser> findAll();

    //按用户名查找用户
    public Voteuser chayonghu(String uname);



}
