/**
 * 说 明  :
 * author: 陆湘星
 * data  : 2011-5-19
 * email : xiangxingchina@163.com
 **/

package com.framework.validation.validators;

import java.util.List;


import com.framework.validation.Field;

public class ValidateTypeAlpha  extends AbstractValidator{

	public void doValidator(List<Field> fields, List<String> args, boolean isAll) {
		for (int i = 0; i < fields.size(); i++) {
			if(i==0 || result || isAll){
				Field field = fields.get(i);
				String value = (String) field.getValue();
				if(value!=null && !"".equals(value)){
						if(!value.matches("^[a-zA-Z]+$")) {
							result = false;
							msg +=field.getFieldDesc()+"：只能是字母类型 !  ";	
						}
				}
			}
		}	
	}

}
