package com.slokam.curd.comparator;

import java.util.Comparator;

import com.slokam.curd.pojo.GeoHirePojo;

public class NameComparator implements Comparator<GeoHirePojo>{
	private Integer option;
	

	public NameComparator(Integer option) {
		super();
		this.option = option;
	}


	public int compare(GeoHirePojo o1, GeoHirePojo o2) {
		
		if(option==1){
		return o1.getName().compareTo(o2.getName());
		}else if(option==2){
			return o1.getCode().compareTo(o2.getCode());
		}
		else if(option==3){
			return o1.getEntity().compareTo(o2.getEntity());
		}
		else if(option==4){
			return o1.getStatus().compareTo(o2.getStatus());	
		}
		return 0;
	}
	/*public NameComparator(int option){
		
	}*/

}
