package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comic.*;

@WebServlet("/ComicServlet")
public class ComicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int comicId = 1;
	private Publisher marvel;
    
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Comic spiderman = new Comic(comicId++, "Amazing Spider-man", "Spiderman");
    	Comic ironman = new Comic(comicId++, "Iron Man", "Ironman");
    	Comic captainamerica = new Comic(comicId++, "Captain America Comics", "Captain America");
    	Comic xmen = new Comic(comicId++, "X-Men", "Wolverine");
    	ArrayList<Comic> comics = new ArrayList<Comic>();
    	comics.add(spiderman);
    	comics.add(ironman);
    	comics.add(captainamerica);
    	comics.add(xmen);
    	Publisher marvel = new Publisher("marvel", "Marvel", "comics");
    	marvel.setProperties(comics);
    	this.marvel = marvel;
    	
    	request.setAttribute("listOfComics", marvel.getProperties());
    	RequestDispatcher rd = request.getRequestDispatcher("/comic.jsp");
        rd.forward(request, response);
    }
	
	 @Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String comicName = request.getParameter("comic");
		 String hero = request.getParameter("hero");
		 marvel.addProperty(new Comic(comicId++, comicName, hero));
		 request.setAttribute("listOfComics", marvel.getProperties());
		 
		 request.getRequestDispatcher("/comic.jsp").forward(request, response);
	 }

}
