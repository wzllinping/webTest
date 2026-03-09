package com.example.webtest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "pageServlet", value = "/pageServlet")
public class PageServlet extends HttpServlet {

    private String message;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // response.setContentType("text/html");
        // Cpu100DemoApplication.java


//                int coreCount = Runtime.getRuntime().availableProcessors();
//                System.out.println("CPU核心数：" + coreCount);
//
//                for (int i = 0; i < coreCount; i++) {
//                    new Thread(() -> {
//                        while (true) {
//                            // 死循环空转，持续占用CPU
//                        }
//                    }, "cpu-eater-thread-" + i).start();
//                }

        request.getRequestDispatcher("/page.jsp").forward(request, response);
    }

    public void destroy() {
    }
}