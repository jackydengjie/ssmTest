package service;

import entity.Voteuser;

import java.util.List;

public interface VoteuserService {

    public List<Voteuser> findAll();

    public Voteuser chayonghu(String uname);
}
