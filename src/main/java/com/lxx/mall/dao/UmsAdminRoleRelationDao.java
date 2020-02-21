package com.lxx.mall.dao;


import com.lxx.mall.mbg.model.UmsPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 后台用户与角色管理自定义Dao
 * @author lixiaoxiang
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}