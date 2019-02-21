package com.legendlee.servlet;

import com.legendlee.utils.VerifyCodeConfig;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//验证手机验证码
public class CodeVerifyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public CodeVerifyServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
