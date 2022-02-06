package com.admixer.adaccount.impl;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import java.util.HashMap;
import java.util.Map;
import com.admixer.adaccount.AdAccountInsight;

@RestLiCollection(name = "adAccountInsights", namespace = "com.admixer.adaccount")
public class AdAccountInsightResource extends CollectionResourceTemplate<Long, AdAccountInsight>  {
    static Map<Long, AdAccountInsight> adAccountInsights = new HashMap<>();
    static {
        adAccountInsights.put(1L, new AdAccountInsight().setAdAccountId(12L).setImpressionCount(10002L));
        adAccountInsights.put(2L, new AdAccountInsight().setAdAccountId(1234L).setImpressionCount(999L));
    }

    public AdAccountInsight get(Long key){
        AdAccountInsight adAccountInsight = adAccountInsights.get(key);
        if (adAccountInsight == null) {
            return null;
        }
        return new AdAccountInsight()
                .setAdAccountId(adAccountInsight.getAdAccountId())
                .setImpressionCount(adAccountInsight.getImpressionCount());

    }

}
