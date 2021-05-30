package belhard.java28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

		try (BufferedReader reader = new BufferedReader (new FileReader ("test.txt")))
		{
			ArrayList<Person> list2 = PersonIOUtil.readPersons ( "D:\\JavaObjects.txt" );
			for (Person person : list2) {
				System.out.println (person.toString ());
			}
		} catch (IOException e) {
			System.out.println (new EmptySourceFileException ( "Файл не найден или пустой" ));
		}


    }
}
