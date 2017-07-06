/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.surenpi.autotest.code;

/**
 * @author suren
 * @date 2016年11月26日 上午10:22:04
 */
public class StringUtils
{
    /**
     * @param cs
     * @return 字符非空返回true
     */
    public static boolean isNotBlank(CharSequence cs)
    {
        return !StringUtils.isBlank(cs);
    }
    
    /**
     * @param cs
     * @return 空字符返回true
     */
    public static boolean isBlank(CharSequence cs)
    {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0)
        {
            return true;
        }
        
        for (int i = 0; i < strLen; i++)
        {
            if (Character.isWhitespace(cs.charAt(i)) == false)
            {
                return false;
            }
        }
        
        return true;
    }

	/**
	 * @param hostType
	 * @param hostValue
	 * @return
	 */
	public static boolean isAnyBlank(String hostType, String hostValue)
	{
		return StringUtils.isBlank(hostValue) || StringUtils.isBlank(hostType);
	}

	/**
	 * 把字符串转化为首字母小写
	 * @param str
	 * @return
	 */
    public static String uncapitalize(String str)
    {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) 
        {
            return str;
        }
        return new StringBuilder(strLen)
            .append(Character.toLowerCase(str.charAt(0)))
            .append(str.substring(1))
            .toString();
    }

	/**
	 * 如果text为空，则返回defText
	 * @see #isBlank(CharSequence)
	 * @param text 待测试文本字符串
	 * @param defText 默认文本字符串
     * @return 字符串
     */
	public static String defaultIfBlank(String text, String defText)
	{
		if(StringUtils.isBlank(text))
		{
			return defText;
		}
		else
		{
			return text;
		}
	}

	/**
	 * @see #defaultIfBlank(String, String)
	 * @param text
	 * @param numText 默认的数字文本
     * @return
     */
	public static String defaultIfBlank(String text, int numText)
	{
		return defaultIfBlank(text, String.valueOf(numText));
	}

	/**
	 * @see #defaultIfBlank(String, String)
	 * @param text
	 * @param numText 默认的数字文本
	 * @return
	 */
	public static String defaultIfBlank(String text, long numText)
	{
		return defaultIfBlank(text, String.valueOf(numText));
	}
}
