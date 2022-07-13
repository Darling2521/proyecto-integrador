package edu.yavirac.backendpi.feature.campaign;

import java.security.Timestamp;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("campaings")
public class Campaign {
    @Id
    @Column("campaign_id")
    private long campaignId;
    @Column("promotionid")
    private String promotionId;
    private String adverStringMedia;
    private Timestamp startDate;
    private Timestamp finalDate;
    private Timestamp created;
    private Timestamp updated;
    private boolean enable;




   

    
}
