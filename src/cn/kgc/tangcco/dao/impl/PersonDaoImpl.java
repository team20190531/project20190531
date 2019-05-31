package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.PersonDao;

public class PersonDaoImpl implements PersonDao {

	@Override
	public void sayHello() {
		System.out.println("dao say hello");
	}

}
