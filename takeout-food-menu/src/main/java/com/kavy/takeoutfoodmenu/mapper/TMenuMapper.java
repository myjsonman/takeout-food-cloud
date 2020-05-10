package com.kavy.takeoutfoodmenu.mapper;

import com.kavy.takeoutfoodmenu.entity.TMenu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
* t_menu
* @author kavy
* @date 2020/05/09
*/
@Mapper
public interface TMenuMapper {

    /**
    * [新增]
    * @author kavy
    * @date 2020/05/09
    **/
    int insert(TMenu tMenu);

    /**
    * [刪除]
    * @author kavy
    * @date 2020/05/09
    **/
    int delete(int id);

    /**
    * [更新]
    * @author kavy
    * @date 2020/05/09
    **/
    int update(TMenu tMenu);

    /**
    * [查询] 根据主键 id 查询
    * @author kavy
    * @date 2020/05/09
    **/
    TMenu load(int id);

    List<TMenu> findAll(int index ,int limit);

    /**
    * [查询] 分页查询
    * @author kavy
    * @date 2020/05/09
    **/
    List<TMenu> pageList(int offset,int pagesize);

    /**
    * [查询] 分页查询 count
    * @author kavy
    * @date 2020/05/09
    **/
    int pageListCount(int offset,int pagesize);

}
