package com.cg.intro;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListImpl implements CurrencyList {

	List<String> currList = new ArrayList<String>();

	public void setCurrList(List<String> currList) {
		this.currList = currList;
	}

	public ArrayList<String> getCurrList() {
		// TODO Auto-generated method stub

		return (ArrayList<String>) currList;
	}

}
