package belhard.java28;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
	Person person1 =  new Person ( "Andrey", "Petrov", new Address ( "Minsk", "Masherova", 99 ));
	Person person2 =  new Person ( null, "Dudko", new Address ( "Minsk", "Lyubimova", 3 ));
	Person person3 =  new Person ( "Andrey", "Ivanov", new Address ( "Minsk", "Lenina", 9 ));
		ArrayList<Person> list = new ArrayList<> ();
		list.add ( person1 );
		list.add ( person3 );
		PersonIOUtil.writePersons ( "D:\\JavaObjects.txt" , list );
		try {
			ArrayList<Person> list2 = PersonIOUtil.readPersons ( "D:\\JavaObjects.txt" );
			for (Person person : list2) {
				System.out.println (person.toString ());
			}
		} catch (NullPointerException e){
			System.out.println ("Значение list2 null");
		}

	}
}
