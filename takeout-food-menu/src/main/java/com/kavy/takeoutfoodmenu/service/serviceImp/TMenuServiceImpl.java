package com.kavy.takeoutfoodmenu.service.serviceImp;

import com.kavy.takeoutfoodmenu.entity.TMenu;
import com.kavy.takeoutfoodmenu.mapper.TMenuMapper;
import com.kavy.takeoutfoodmenu.service.TMenuService;
import com.kavy.takeoutfoodmenu.utils.ResultCode;
import com.kavy.takeoutfoodmenu.utils.ResultJson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* t_menu
* @author kavy
* @date 2020/05/09
*/
@Service
public class TMenuServiceImpl implements TMenuService {

	@Resource
	private TMenuMapper tMenuMapper;


	@Override
	public ResultJson<String> insert(TMenu tMenu) {

		// valid
		if (tMenu == null) {
			return new ResultJson<String>(ResultCode.BAD_REQUEST, "必要参数缺失");
        }

		tMenuMapper.insert(tMenu);
        return ResultJson.success();
	}


	@Override
	public ResultJson<String> delete(int id) {
		int ret = tMenuMapper.delete(id);
		return ResultJson.success();
	}


	@Override
	public ResultJson<String> update(TMenu tMenu) {
		int ret = tMenuMapper.update(tMenu);
		return ResultJson.success();
	}


	@Override
	public TMenu load(int id) {
		return tMenuMapper.load(id);
	}


	@Override
	public Map<String,Object> pageList(int offset, int pagesize) {

		List<TMenu> pageList = tMenuMapper.pageList(offset, pagesize);
		int totalCount = tMenuMapper.pageListCount(offset, pagesize);

		// result
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("pageList", pageList);
		result.put("totalCount", totalCount);

		return result;
	}

	@Override
	public List<TMenu> findAll(int index, int limit) {

		return tMenuMapper.findAll(index,limit);
	}

}
