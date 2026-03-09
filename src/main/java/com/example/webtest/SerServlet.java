package com.example.webtest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "serServlet", value = "/serServlet")
public class SerServlet extends HttpServlet {
    private String message;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json"); // 设置响应类型为JSON
        response.setCharacterEncoding("UTF-8");
       // UserInfo userInfo = new UserInfo("wang",20);
        // ObjectMapper mapper = new ObjectMapper();
        // String jsonStr = mapper.writeValueAsString(userInfo);

//        // 使用Gson
     //   Gson gson = new Gson();
        // String jsonStr = gson.toJson(userInfo);
        // PrintWriter out = response.getWriter();
        // out.print(jsonStr);
        // out.flush();
        // out.close();
    }

    public void destroy() {
    }
}
