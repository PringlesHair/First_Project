package com.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.main.controller.Controller;
import com.theme.dao.ThemeMyBatisDAO;

public class BoardDeleteController implements Controller {
  
    public BoardDeleteController() {
        super();
    }

	@Override
	public String requestProcessor(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		ThemeMyBatisDAO dao = new ThemeMyBatisDAO();
		dao.boardDelete(num);
		
		return null;
	}
}
