package com.simplicite.objects.Agd;

import java.util.*;
import com.simplicite.util.*;
import com.simplicite.util.tools.*;
import com.simplicite.webapp.tools.ServletTool;
/**
 * Business object AgdAds
 */
public class AgdAds extends ObjectDB {
	private static final long serialVersionUID = 1L;
	
	
	public void archiveAds(){
		AppLog.info("message" + getGrant().getContextURL(), getGrant());
		boolean[] oldcrud = getGrant().changeAccess("AgdAds", true, true,true,false);
		ObjectDB ads = getGrant().getTmpObject("AgdAds");
		ads.resetFilters();
		ads.resetValues();
		ads.getField("agdAdsStatus").setFilter("VAL");
		ads.getField("updated_dt").setFilter(" < NOW() -INTERVAL '"+Grant.getSystemAdmin().getParameter("AGD_ARCHIV_DELAY")+"' WEEK");
		List<String[]> r = ads.search();
		synchronized(ads){
			for(int i=0;i<r.size();i++){
				ads.setValues(r.get(i),true);
				ads.setFieldValue("agdAdsStatus","ARC");
				try{
					new BusinessObjectTool(ads).validateAndUpdate();
				}catch(Exception e){
					AppLog.error("Error updating Ads", e, getGrant());	
				}
			}
		}
		getGrant().changeAccess("AgdAds",oldcrud);
	}
}
