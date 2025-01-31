package com.entity.view;

import com.entity.IckaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * ic卡信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
@TableName("ickaxinxi")
public class IckaxinxiView  extends IckaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public IckaxinxiView(){
	}
 
 	public IckaxinxiView(IckaxinxiEntity ickaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ickaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
