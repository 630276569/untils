package cn.lz.bos.utils;

import cn.lz.bos.domain.User;
import org.apache.struts2.ServletActionContext;

/**
 * Created by lz on 2017/11/2.
 */
public class BosContext {

    public static User getCurrentUser(){
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");

        return user;
    }

}
