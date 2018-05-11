package com.yang.code.test;

public class DealIterator implements Iterator {
    String[] deals;
    int position = 0;

    public DealIterator(String[] deals) {
    	this.deals = deals;
	}

	@Override
    public Object next() {
		Object rtnValue = deals[position];
		position++;
		return rtnValue;
    }

    @Override
    public boolean hasNext() {
    	if("" != deals[position] && null != deals[position]) {
    		return true;
    	} else {
    		return false;
    	}
    }
}