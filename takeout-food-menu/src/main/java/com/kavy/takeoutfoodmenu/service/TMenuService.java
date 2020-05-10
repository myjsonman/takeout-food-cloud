package com.kavy.takeoutfoodmenu.service;

import com.kavy.takeoutfoodmenu.entity.TMenu;
import com.kavy.takeoutfoodmenu.utils.ResultJson;

import java.util.List;
import java.util.Map;

/**
* t_menu
* @author kavy
* @date 2020/05/09
*/
public interface TMenuService {

    /**
    * 新增
    */
    public ResultJson<String> insert(TMenu tMenu);

    /**
    * 删除
    */
    public ResultJson<String> delete(int id);

    /**
    * 更新
    */
    public ResultJson<String> update(TMenu tMenu);

    /**
    * 根据主键 id 查询
    */
    public TMenu load(int id);

    /**
    * 分页查询
    */
    public Map<String,Object> pageList(int offset, int pagesize);

    List<TMenu> findAll(int index , int limit);

}
