package assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business;

import java.util.*;
import java.util.stream.Collectors;

import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business.Book;
import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.business.LibraryMember;
import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.dataaccess.DataAccess;
import assignment.lab9.lab9Part1_1.prob1.lesson9.labs.prob1.dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}

	// Returns a list of all ids of LibraryMembers whose zipcode contains the digit
	// 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		
		// implemented
		return mems.stream()
				.filter(member -> member.getAddress().getZip().contains("3"))
				.map(member -> member.getMemberId())
				.collect(Collectors.toList());

	}

	// Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		
		// implemented
		return bs.stream()
				.filter(book -> book.getCopies().length >= 2)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());

	}

	// Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		
		// implemented
		return bs.stream()
				.filter(book -> book.getAuthors().size() > 1)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());

	}

}
