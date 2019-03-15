package de.hitec.oaidashboard.parsers.datastructures;

import java.util.ArrayList;

public class HarvestedRecord {
	public ArrayList<String> specList;
    public String rights;
    public String dateStamp;
    public String identifier;

    public HarvestedRecord()
    {
    	specList = new ArrayList<String>();
    	rights   = "NO_RIGHTS";
    	dateStamp = "";
    }
}
