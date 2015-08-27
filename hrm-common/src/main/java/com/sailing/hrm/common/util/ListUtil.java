/**
 * 
 * @title ListUtil.java
 * @package com.bjhit.erange.util
 * @copyright(c) 2009-2012 BJHIT.com All rights reserved.
 * @date 2013-4-15 下午2:13:09
 * @version V1.0 
 */
package com.sailing.hrm.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;


/**
 * @date 2013-4-15 下午2:13:09
 */
@SuppressWarnings("unchecked")
public class ListUtil {

    private static final Logger LOG = Logger.getLogger(ListUtil.class);

    /**
     * 判断集合是否为空
     * @param list 集合
     * @return 验证结果
     */
    public static boolean isNullOrEmpty(List<?> list) {
        boolean flag = false;
        if (list == null || list.size() == 0) {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断集合不为空
     * @param list
     * @return
     * @version V2.0
     */
    public static boolean notNOE(List<?> list) {
        return !isNullOrEmpty(list);
    }

    /**
     * 判断集合是否相同
     * @param srcList
     * @param dstList
     * @return
     */
    public static boolean equals(List<?> srcList, List<?> dstList) {
        //        boolean flag = false;
        //        if(srcList.size() == dstList.size()){
        //            Collections.sort(srcList);
        //            Collections.sort(dstList);
        //            for(int i = 0; i < srcList.size(); i++){
        //                if(!srcList.get(i).equals(dstList.get(i))){
        //                    flag = false;
        //                    break;
        //                }
        //            }
        //            CollectionUtils.isEqualCollection(srcList, dstList);
        //        }
        return CollectionUtils.isEqualCollection(srcList, dstList);
    }

    /**
     * 判断目标集合是否是元集合子集
     * @param srcList 元集合
     * @param dstList 目标集合
     * @return 判断结果
     */
    public static boolean isSub(List<?> srcList, List<?> dstList) {
        return CollectionUtils.isSubCollection(dstList, srcList);
    }

    /**
     * 获取目标集合与元集合的差集( src - dst )
     * @param srcList 元集合
     * @param dstList 目标集合
     * @return 
     */
    public static <T extends Comparable<T>> List<T> subTract(List<T> srcList, List<T> dstList) {
        return (List<T>) CollectionUtils.subtract(srcList, dstList);
    }

    /**
     * 并集(不去重复)
     * @param srcList
     * @param dstList
     * @return
     */
    public static <T> List<T> union(List<T> srcList, List<T> dstList) {
        return (List<T>) CollectionUtils.union(srcList, dstList);
    }

    /**
     * 对list进行分页
     * @param list 集合
     * @param curPage 当前页
     * @param pageSize 页大小
     * @return
     * @version V2.0
     */
    public static <T> List<T> paged(List<T> list, int curPage, int pageSize) {
    	List<T> newList = new ArrayList<T>();
    	int firstIdx = ((curPage - 1) * pageSize);
        int lastIdx = firstIdx + pageSize;
        if(firstIdx < list.size()){
        	if(lastIdx < list.size()){
        		newList = list.subList(firstIdx, lastIdx);
        	}else{
        		newList = list.subList(firstIdx, list.size());
        	}
        }
    	return newList;
    }

    /**
     * 交集
     * @param srcList
     * @param dstList
     * @return
     */
    public static <T extends Comparable<T>> List<T> inter(List<T> srcList, List<T> dstList) {
        return (List<T>) CollectionUtils.intersection(srcList, dstList);
    }

    /**
     * 交集的补集
     * @param srcList
     * @param dstList
     * @return
     */
    public static <T extends Comparable<T>> List<T> disjunction(List<T> srcList, List<T> dstList) {
        return (List<T>) CollectionUtils.disjunction(srcList, dstList);
    }

    /**
     * 根据属性名和属性值，在集合中获取符合条件的第一个对象
     * @param propertyName 属性名称
     * @param propertyValue 属性值
     * @param list 集合
     * @return
     */
    public static <T> T getObject(String propertyName, Object propertyValue, List<T> list) {
        for (T t : list) {
            try {
                Method method = t.getClass().getDeclaredMethod("get" + StringUtil.initialToUpper(propertyName));
                if (method.invoke(t).equals(propertyValue)) {
                    return t;
                }
            }
            catch (Exception e) {
//                LOG.debug(Constants.DEBUG_MESSAGE, e);
            }
        }
        return null;
    }

    /**
     * 查询Map中List为指定值的关键字
     * @param map 键/值对集合
     * @param value 指定值
     * @return
     */
    public static String getKeyContainsValue(Map<String, List<String>> map, String value) {
        String obj = null;
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            for (String item : list) {
                if (item.equals(value)) {
                    obj = key;
                    break;
                }
            }
            if (obj != null) {
                break;
            }
        }
        return obj;
    }

    /**
     * 拷贝集合
     * @param list
     * @return
     * @version V2.0
     */
    public static <T> List<T> copy(List<T> list){
        List<T> copy = new ArrayList<T>();
        for(int i=0;i<list.size(); i++){
            copy.add(list.get(i));
        }
        return copy;
    }
}
