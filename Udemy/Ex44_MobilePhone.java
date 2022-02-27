import java.util.ArrayList;

class MobilePhone
{
	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber)
	{
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}

	private int findContact(Contact c)
	{
		return findContact(c.getName());
	}

	private int findContact(String contactName)
	{
		for (Contact myC : myContacts)
			if (myC.getName().equals(contactName))
				return myContacts.indexOf(myC);

		// Contact doesn't exist.
		return -1;
	}

	public boolean addNewContact(Contact c)
	{
		// Contact already exists.
		if (findContact(c) != -1)
			return false;

		// Contact doesn't exist.
		myContacts.add(c);
		return true;
	}

	public boolean updateContact(Contact original, Contact update)
	{
		int index = findContact(original);
		if (index == -1)
			return false;

		// Original exists.
		myContacts.set(index, update);
		return true;
	}

	public boolean removeContact(Contact c)
	{
		if (findContact(c) == -1)
			return false;

		// Contact c exists.
		myContacts.remove(c);
		return true;
	}

	public Contact queryContact(String contactName)
	{
		int index = findContact(contactName);
		return index == -1 ? null : myContacts.get(index);
	}

	public void printContacts()
	{
		int i = 1;
		System.out.println("Contact List:");

		for (Contact c : myContacts)
			System.out.printf("%d. %s -> %s" + "%n", i++,
			                  c.getName(),
			                  c.getPhoneNumber());
	}
}

public class Contact
{
	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName()
	{
		return name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public static Contact createContact(String name, String phoneNumber)
	{
		return new Contact(name, phoneNumber);
	}
}

/*
Create a program that implements a simple mobile phone.

1.  Implement master class MobilePhone (ArrayList of Contacts) with attributes:

    -  Two fields:
       A String called myNumber.
       An ArrayList (Contact) called myContacts.

    -  Constructor:
       Takes String (phone number),
       initialises myNumber,
       instantiates myContacts.

    -  Seven methods, they are (their functions are in their names):

        -  addNewContact(), 1 param (Contact) and returns a boolean.
           Returns true if the contact doesn't exist.
           Returns false if the contact already exists.

        -  updateContact(), 2 param (Contact) and returns a boolean.
           The old contact that will be updated with the new contact.
           Returns true if the contact exists and was updated successfully.
           Returns false if the contact doesn't exist.

        -  removeContact(), 1 param (Contact) and returns a boolean.
           Returns true if the contact exists and was removed successfully.
           Returns false if the contact doesn't exist.

        -  findContact(), has 1 param (Contact) and returns an int.
           The returned value is its position in the ArrayList.
           It will either be -1 (doesn't exists),
           or a value greater than or equal to 0 (does exist).

        -  findContact(), same as above, only it has 1 param (String).

        -  queryContact(), has 1 param (String) and returns a Contact.
           Use the String to search for the name and then return the Contact.
           Return null otherwise.

        -  printContacts(), has no param and doesn't return anything.
           Print the contacts in the following format:

           Contact List:
           1. Bob -> 31415926
           2. Alice -> 16180339
           3. Tom -> 11235813
           4. Jane -> 23571113

2. Implement the Contact class with the following attributes:

    -  Two fields (both String): name and phoneNumber.

    -  A constructor that takes two Strings, initialises name and phoneNumber.

    -  Three methods:

        -  getName(), getter for name.

        -  getPhoneNumber(), getter for phoneNumber.

        -  createContact():
           Has two param (String) which are the persons name and phone number.
           Returns an instance of Contact.
           This is the only method that is static.

TIP:  Use findContact() in MobilePhone's methods to check (exists) first.
      Two Contact objects are equal if they have the same name.
      Be extremely careful about spaces in the printed message.

NOTE:  All fields are private.
       Constructors should be defined as public.
       All methods should be defined as public (except findContact(), private).
       Do not add a main method to the solution code.
*/
