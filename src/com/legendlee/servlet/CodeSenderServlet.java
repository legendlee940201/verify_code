package com.legendlee.servlet;

import com.legendlee.utils.VerifyCodeConfig;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


/*
 * 	①输入手机号，点击发送后随机生成6位数字码，2分钟有效
 * 		 前台页面提供的数据：  phone_no : 电话号
 *      后台：
 *      		key:  phone_no
 *      		value :  String类型
 *      			setex(key,value,120)
 * 					生成之后，响应true即可！
 * 
	②输入验证码，点击验证，返回成功或失败
	
	③每个手机号每天只能输入3次
			
			额外的变量记录用户每天生成验证码的次数！
				key: phone_no
				value: string类型
				   setex(key,value,一天)
				   incr(key);
				   
			判断次数的逻辑，位于生成验证码之前，如果已经超过次数就不用生成了！
			
	核心：  根据业务需要，使用合适的value类型，调用相应的api!
				   
	

 */
public class CodeSenderServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public CodeSenderServlet() {

	}


	//用户填写手机号，处理请求，并返回此手机号的验证码
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//从浏览器获得用户输入的手机号
		String phone_no = request.getParameter("phone_no");
		//验证数据的合法性
		if("".equals(phone_no)||phone_no==null){
			System.out.println("非法数据");
			return;
		}

		/**
		 * 如何处理请求？
		 * 		将获得到的手机号作为key存储到redis中，返回的验证码
		 */

	}

	//生成6位验证码
	private  String getCode(int len){
		String code="";
		for (int i = 0; i < len; i++) {
			int rand=  new Random().nextInt(10);
			code+=rand;
		}

		return code;
	}
}
