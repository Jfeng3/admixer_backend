package com.admixer.adaccount.impl;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import java.util.HashMap;
import java.util.Map;
import com.admixer.adaccount.AdAccountInsight;

@RestLiCollection(name = "adAccountInsights", namespace = "com.admixer.adaccount")
public class AdAccountInsightResource extends CollectionResourceTemplate<Long, AdAccountInsight>  {
    
}
