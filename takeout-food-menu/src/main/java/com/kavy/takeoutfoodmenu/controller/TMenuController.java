package com.kavy.takeoutfoodmenu.controller;

import com.kavy.takeoutfoodmenu.entity.TMenu;
import com.kavy.takeoutfoodmenu.service.TMenuService;
import com.kavy.takeoutfoodmenu.utils.ResultJson;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

import java.util.Map;

/**
* t_menu
* @author kavy
* @date 2020/05/09
*/
@RestController
@RequestMapping("/tmemu")
@RefreshScope
public class TMenuController {

    @Resource
    private TMenuService tMenuService;


    @RequestMapping("/test")
    public ResultJson<String> test( ){
        System.out.println("你好呀");
        return ResultJson.ok("你好呀");
    }
    /**
    * [新增]
    * @author kavy
    * @date 2020/05/09
    **/
    @RequestMapping("/insert")
    public ResultJson<String> insert(TMenu tMenu){
        return tMenuService.insert(tMenu);
    }


    /**
    * [刪除]
    * @author kavy
    * @date 2020/05/09
    **/
    @RequestMapping("/delete")
    public ResultJson<String> delete(int id){
        return tMenuService.delete(id);
    }

    /**
    * [更新]
    * @author kavy
    * @date 2020/05/09
    **/
    @RequestMapping("/update")
    public ResultJson<String> update(TMenu tMenu){
        return tMenuService.update(tMenu);
    }

    /**
    * [查询] 根据主键 id 查询
    * @author kavy
    * @date 2020/05/09
    **/
    @RequestMapping("/load")
    public ResultJson<String> load(int id){

        return ResultJson.ok(tMenuService.load(id));
    }

    /**
    * [查询] 分页查询
    * @author kavy
    * @date 2020/05/09
    **/
    @RequestMapping("/pageList")
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return tMenuService.pageList(offset, pagesize);
    }

    @RequestMapping("/findAll/{index}/{limit}")
    public ResultJson<String> findAll(@PathVariable int index, @PathVariable int limit){
        System.out.println("sdfsdf");
        return ResultJson.ok(tMenuService.findAll(index,limit));
    }
}
