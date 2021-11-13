package esprit.spring.schedulingtasks;


import esprit.spring.entities.Stock;
import esprit.spring.service.StockServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Autowired
    private StockServiceImpl sr;


    @Scheduled(fixedRate = 60000)
    public void check() {
        for(Stock s : sr.warnStock()) {
        log.info("STOCK EN DANGER DETECTE "+s.getLibelleStock(), dateFormat.format(new Date())); }
    }




}
