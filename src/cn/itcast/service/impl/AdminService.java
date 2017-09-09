package cn.itcast.service.impl;

import cn.itcast.dao.IAdminDao;
import cn.itcast.entity.Admin;
import cn.itcast.service.IAdminService;

public class AdminService implements IAdminService {

	//注入dao [这里一定要用接口接收]
	private IAdminDao adminDao;
	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public void register(Admin admin) {
		adminDao.save(admin);
	}

	public Admin login(Admin admin) {
		return adminDao.findByIdAdmin(admin);
	}

}
