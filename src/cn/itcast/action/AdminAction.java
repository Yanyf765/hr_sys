package cn.itcast.action;

import cn.itcast.entity.Admin;
import cn.itcast.service.IAdminService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven<Admin> {

    // ��װ����
    private Admin admin = new Admin();

    public void setAdmin(Admin admin) {
	this.admin = admin;
    }

    public Admin getModel() {

	return admin;
    }

    // ����service
    private IAdminService adminService;

    public void setAdminService(IAdminService adminService) {
	this.adminService = adminService;
    }

    /**
     * ��½
     */
    public String login() {
	// ��½��֤
	Admin adminInfo = adminService.login(admin);
	if (adminInfo == null) {
	    // ��½ʧ��
	    return "loginFaild";
	} else {
	    // ��½�ɹ�,�������ݵ�sessin
	    ActionContext.getContext().getSession().put("adminInfo", adminInfo);
	    return "index";
	}
    }
}
