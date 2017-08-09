package cn.love.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.love.common.pojo.EasyUIDataGridResult;
import cn.love.pojo.TbItem;
import cn.love.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@ResponseBody
	@RequestMapping("/item/{itemId}")
	public TbItem getItemById(@PathVariable("itemId")long itemId){
		return itemService.getItemById(itemId);
	}
	
	@ResponseBody
	@RequestMapping("/item/list")
	public EasyUIDataGridResult getItemList(Integer page,Integer rows){
		EasyUIDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
}
