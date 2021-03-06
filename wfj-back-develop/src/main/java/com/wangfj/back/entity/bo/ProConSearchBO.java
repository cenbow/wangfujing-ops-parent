/**
 * @Probject Name: shopin-back-demo
 * @Path: com.wangfj.back.entity.boProConSearchBO.java
 * @Create By  k
 * @Create In 2013-5-9 下午3:12:35
 * TODO
 */
package com.wangfj.back.entity.bo;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.wangfj.back.entity.cond.ProConSearchCond;
import com.wangfj.back.entity.po.ProConSearch;


/**
 * @Class Name ProConSearchBO
 * @Author k
 * @Create In 2013-5-9
 */
public class ProConSearchBO {
	public static void Con2Po(ProConSearchCond cond,ProConSearch pcs){
		try {
			BeanUtils.copyProperties(pcs, cond);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	public static void Po2Con(ProConSearch pcs,ProConSearchCond cond){
		try {
			BeanUtils.copyProperties(cond, pcs);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
