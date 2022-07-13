package edu.yavirac.backendpi.feature.campaign;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CampaingRepository extends CrudRepository<Campaign, Long>{
    List<Campaign> findAll();
    
}

