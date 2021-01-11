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
        System.out.println("VoteuserServiceImpl方法执行");
        List<Voteuser> list=voteuserMapper.findAll();

        return list;
    }

    public VoteuserMapper getVoteuserMapper() {
        return voteuserMapper;
    }

    public void setVoteuserMapper(VoteuserMapper voteuserMapper) {
        this.voteuserMapper = voteuserMapper;
    }
}
