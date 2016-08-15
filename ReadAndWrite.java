package com.assignmentaugfifteen;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadAndWrite{

	static ArrayList<String> startingListOfCountries = new ArrayList<>();

	Path aNewPath = Paths.get("\\Users\\admin\\newWorkspace\\WeekThreeDayOne\\src\\com\\assignmentaugfifteen\\CountriesListtxt");

	File aNewFile = aNewPath.toFile();
	Scanner sc = new Scanner(System.in);
	String read;
	String write;

	public ReadAndWrite(String read, String write) {
		super();
		this.read = read;
		this.write = write;
	}

	public ReadAndWrite() {

	}

	public void reader(){

		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile))){

			while((read = in.readLine()) != null){
				startingListOfCountries.add(read);
				System.out.println(read);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public void writer(){

		try (
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true)))){

			write = sc.nextLine();

			out.println(write);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}





















