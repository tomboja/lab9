package assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business;

import java.util.List;

import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business.Book;
import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.dataaccess.DataAccess;
import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
