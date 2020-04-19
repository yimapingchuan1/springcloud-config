package com.xuejian;

public final class StringUtil {
    /**
     * 获取value的值 如果value为空，返回0
     * @param value 入参
     * @return 转换值
     */
    public static String getValue(String value){
        return value == null || "".equals(value) ? "0" : value;
    }

    /**
     * 判断输入的多个字符串均非空
     * @param ss 多个字符串数组
     * @return 如果都不为空，返回true，否则返回false
     */
     public static boolean isNotNull(String... ss){
        if(ss == null || ss.length == 0){
            return false;
        }
         for (String s : ss) {
             if(s == null || "".equals(s)){
                 return false;
             }
         }
         return true;
     }
}
