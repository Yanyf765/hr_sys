package cn.itcast.action;

import cn.itcast.entity.Admin;
import cn.itcast.service.IAdminService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven<Admin> {

    // 封装数据
    private Admin admin = new Admin();

    public void setAdmin(Admin admin) {
	this.admin = admin;
    }

    public Admin getModel() {

	return admin;
    }

    // 调用service
    private IAdminService adminService;

    public void setAdminService(IAdminService adminService) {
	this.adminService = adminService;
    }

    /**
     * 登陆
     */
    public String login() {
	// 登陆验证
	Admin adminInfo = adminService.login(admin);
	if (adminInfo == null) {
	    // 登陆失败
	    return "loginFaild";
	} else {
	    // 登陆成功,保存数据到sessin
	    ActionContext.getContext().getSession().put("adminInfo", adminInfo);
	    return "index";
	}
    }
}
