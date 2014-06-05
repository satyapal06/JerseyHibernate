package com.dao.onetomanymapping;

import com.entity.onetomanymapping.Address;

public interface AddressDAO<T> {

	public void save(Address address);

}
