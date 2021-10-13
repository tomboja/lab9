package assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.dataaccess;

import java.util.HashMap;

import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business.Book;
import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business.LibraryMember;

public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
