package com.sailing.hrm.common.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {

	/**
	 * 
	 * @param s
	 * @return
	 */
	@Deprecated
	public static String stringToJson(String s) {
		if (s == null) {
			return nullToJson();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
			case '"':
				sb.append("\\\"");
				break;
			case '\\':
				sb.append("\\\\");
				break;
			case '\b':
				sb.append("\\b");
				break;
			case '\f':
				sb.append("\\f");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\r':
				sb.append("\\r");
				break;
			case '\t':
				sb.append("\\t");
				break;
			case '/':
				sb.append("\\/");
				break;
			default:
				if (ch >= '\u0000' && ch <= '\u001F') {
					String ss = Integer.toHexString(ch);
					sb.append("\\u");
					for (int k = 0; k < 4 - ss.length(); k++) {
						sb.append('0');
					}
					sb.append(ss.toUpperCase());
				} else {
					sb.append(ch);
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 
	 * @return
	 */
	@Deprecated
	public static String nullToJson() {
		return "";
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	@Deprecated
	public static String objectToJson(Object obj) {
		StringBuilder json = new StringBuilder();
		if (obj == null) {
			json.append("\"\"");
		} else if (obj instanceof Number) {
			json.append(numberToJson((Number) obj));
		} else if (obj instanceof Boolean) {
			json.append(booleanToJson((Boolean) obj));
		} else if (obj instanceof String) {
			json.append("\"").append(stringToJson(obj.toString())).append("\"");
		} else if (obj instanceof Object[]) {
			json.append(arrayToJson((Object[]) obj));
		} else if (obj instanceof List) {
			json.append(listToJson((List<?>) obj));
		} else if (obj instanceof Map) {
			json.append(mapToJson((Map<?, ?>) obj));
		} else if (obj instanceof Set) {
			json.append(setToJson((Set<?>) obj));
		} else {
			json.append(beanToJson(obj));
		}
		return json.toString();
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	@Deprecated
	public static String numberToJson(Number number) {
		return number.toString();
	}

	/**
	 * 
	 * @param bool
	 * @return
	 */
	@Deprecated
	public static String booleanToJson(Boolean bool) {
		return bool.toString();
	}

	/**
	 * 
	 * @param bean
	 * @return String
	 */
	@Deprecated
	public static String beanToJson(Object bean) {
		return toJson(bean);
	}

	/**
	 * 
	 * @param list
	 *            list对象
	 * @return String
	 */
	@Deprecated
	public static String listToJson(List<?> list) {
		return toJson(list);
	}

	/**
	 * 
	 * @param array
	 *            对象数组
	 * @return String
	 */
	@Deprecated
	public static String arrayToJson(Object[] array) {
		return toJson(array);
	}

	/**
	 * 
	 * @param map
	 * @return String
	 */
	@Deprecated
	public static String mapToJson(Map<?, ?> map) {
		StringBuilder json = new StringBuilder();
		json.append("{");
		if (map != null && map.size() > 0) {
			for (Object key : map.keySet()) {
				json.append(objectToJson(key));
				json.append(":");
				json.append(objectToJson(map.get(key)));
				json.append(",");
			}
			json.setCharAt(json.length() - 1, '}');
		} else {
			json.append("}");
		}
		return json.toString();
	}

	/**
	 * 
	 * @param set
	 * @return
	 */
	@Deprecated
	public static String setToJson(Set<?> set) {
		StringBuilder json = new StringBuilder();
		json.append("[");
		if (set != null && set.size() > 0) {
			for (Object obj : set) {
				json.append(objectToJson(obj));
				json.append(",");
			}
			json.setCharAt(json.length() - 1, ']');
		} else {
			json.append("]");
		}
		return json.toString();
	}

	/**
	 * 转换对象为JSON格式
	 * 
	 * @param object
	 * @return
	 */
	public static String toJson(Object object) {
		if (object == null) {
			return null;
		} else if (isWrapObject(object)) {
			return object.toString();
		} else if (isMuiltObject(object)) {
			return JSONArray.fromObject(object).toString();
		}
		return JSONObject.fromObject(object).toString();
	}

	/**
	 * 是否JSON格式字符串
	 * 
	 * @param json
	 * @return
	 */
	public static boolean isJson(String json) {
		boolean flag = true;
		try {
			JSONObject.fromObject(json);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 从JSON字符串获取指定key的数据
	 * 
	 * @param jsonStr
	 * @param key
	 * @return
	 */
	public static String getFromJson(String jsonStr, String key) {
		JSONObject jsonObject = JSONObject.fromObject(jsonStr);
		return jsonObject.getString(key);
	}

	/**
	 * 判断对象是否为简单数据类型
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isWrapObject(Object object) {
		try {
			return ((Class<?>) object.getClass().getField("TYPE").get(null)).isPrimitive();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 判断对象是不是集合或者数组
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isMuiltObject(Object object) {
		boolean flag = false;
		if (object instanceof Collection<?> || /* object instanceof Map<?,?> || */object.getClass().isArray()) {
			return true;
		}
		return flag;
	}
}
