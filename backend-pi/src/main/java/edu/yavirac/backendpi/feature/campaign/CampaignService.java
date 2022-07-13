package edu.yavirac.backendpi.feature.campaign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {


    @Autowired
    CampaingRepository campaingRepository;

    //create
    public Campaign save(Campaign campaign) {
        return campaingRepository.save(campaign);
    }

    public Campaign findById(long id) {
        return campaingRepository.findById(id).orElse(new Campaign());
    }

    public void deleteById(long id){ 
        campaingRepository.deleteById(id);
    }

    public List<Campaign> getCampaingfindAll(){
        return campaingRepository.findAll();
    }

    public List<Campaign> findAll() {
        return campaingRepository.findAll();
    }

}