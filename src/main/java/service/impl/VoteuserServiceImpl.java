package service.impl;

import entity.Voteuser;
import mapper.VoteuserMapper;
import org.springframework.stereotype.Service;
import service.VoteuserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VoteuserServiceImpl implements VoteuserService {
    @Resource
    private VoteuserMapper voteuserMapper;

    @Override
    public List<Voteuser> findAll() {
        System.out.println("VoteuserServiceImpl的findAll方法执行");
        List<Voteuser> list=voteuserMapper.findAll();

        return list;
    }

    @Override
    public Voteuser chayonghu(String uname) {
        System.out.println("VoteuserServiceImpl的chayonghu方法执行");
        Voteuser chayonghu = voteuserMapper.chayonghu(uname);


        return chayonghu;
    }

    public VoteuserMapper getVoteuserMapper() {
        return voteuserMapper;
    }

    public void setVoteuserMapper(VoteuserMapper voteuserMapper) {
        this.voteuserMapper = voteuserMapper;
    }
}
