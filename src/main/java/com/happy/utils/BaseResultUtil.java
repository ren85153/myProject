package com.happy.utils;

import com.happy.base.BaseResult;
import com.happy.common.BaseResultEnum;

public class BaseResultUtil {
	 
    /**成功且带数据**/
    public static BaseResult success(Object object){
        BaseResult BaseResult = new BaseResult();
        BaseResult.setCode(BaseResultEnum.SUCCESS.getCode());
        BaseResult.setMsg(BaseResultEnum.SUCCESS.getMsg());
        BaseResult.setData(object);
        return BaseResult;
    }
    /**成功但不带数据**/
    public static BaseResult success(){
        return success(null);
    }
    /**失败**/
    public static BaseResult error(Integer code,String msg){
        BaseResult BaseResult = new BaseResult();
        BaseResult.setCode(code);
        BaseResult.setMsg(msg);
        return BaseResult;
    }
}
