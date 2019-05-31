package cn.kgc.tangcco.service.impl;

import cn.kgc.tangcco.dao.PersonDao;
import cn.kgc.tangcco.service.PersonService;

public class PersonServiceImpl implements PersonService {

	private PersonDao pdao;
	@Override
	public void sayHello() {
		System.out.println("service say hello");
		pdao.sayHello();
	}

}
