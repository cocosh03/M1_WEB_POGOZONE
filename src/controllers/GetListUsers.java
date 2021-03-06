package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDAO;

/**
 * Servlet implementation class RequestBDD
 */
@WebServlet("/ListUsers")
public class GetListUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String ATT_NAME          = "listename";
	private static ArrayList<String> listUsers = new ArrayList<>();

	private static Map<String ,String> listUsersName= new HashMap<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetListUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			listUsersName = UsersDAO.selectUsersIdName();
		} catch (Exception e) {
			e.printStackTrace();
		}

        request.setAttribute(ATT_NAME, listUsersName);
        this.getServletContext().getRequestDispatcher( "/admin/ListUsers.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
