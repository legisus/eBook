package com.eBook.controller.admin;

import com.eBook.entity.Users;
import com.eBook.service.UserServices;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListUsersServlet", value ="/admin/list_users")

public class ListUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserServices userServices = new UserServices();

        List<Users> listUsers = userServices.listUser();
        request.setAttribute("list", listUsers);

        String listPage = "WEB-INF/admin/user_list.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);


        requestDispatcher.forward(request, response);


    }
}
