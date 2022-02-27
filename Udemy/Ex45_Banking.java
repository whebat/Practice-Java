import java.util.ArrayList;

public class Ex45_Banking
{
	public static void main(String[] args)
	{
		Bank bank = new Bank("National Australia Bank");

		bank.addBranch("Adelaide");

		bank.addCustomer("Adelaide", "Tim", 50.05);
		bank.addCustomer("Adelaide", "Mike", 175.34);
		bank.addCustomer("Adelaide", "Percy", 220.12);

		bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
		bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
		bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

		bank.listCustomers("Adelaide", true);
	}
}

class Bank
{
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name)
	{/// Constructor.
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName)
	{
		if (findBranch(branchName) != null)
			return false;

		branches.add(new Branch(branchName));
		return true;
	}

	public boolean addCustomer(String branchName, String customerName, double initialAmount)
	{
		Branch searchTarget = findBranch(branchName);
		return searchTarget == null
		       ? false
		       : branches.get(branches.indexOf(searchTarget))
		                 .newCustomer(customerName, initialAmount);
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double value)
	{
		Branch searchTarget = findBranch(branchName);
		return searchTarget == null
		       ? false
		       : branches.get(branches.indexOf(searchTarget))
		                 .addCustomerTransaction(customerName, value);
	}

	private Branch findBranch(String branchName)
	{
		Branch searchTarget = null;

		for (Branch index : branches)
			if (index.getName().equals(branchName))
				searchTarget = index;

		return searchTarget;
	}

	public boolean listCustomers(String branchName, boolean withTransactions)
	{
		// Does the branch exist? It should exist.
		Branch searchTarget = findBranch(branchName);
		if (searchTarget == null)
			return false;

		// What's the index of the branch?
		int b = branches.indexOf(searchTarget);

		System.out.println("Customer details for branch " + branchName);

		int i = 1;
		for (Customer c : branches.get(b).getCustomers()) {

			System.out.printf("Customer: %s[%d]%n",
			                  c.getName(), i++);

			if (withTransactions) {

				System.out.println("Transactions");
				int z = 1;
				for (double value : c.getTransactions())
					System.out.printf("[%d]  Amount %.2f%n",
					                  z++, value);
			}
		}
		return true;
	}
}

class Branch
{
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name)
	{/// Constructor.
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	public String getName()
	{/// Accessor.
		return name;
	}

	public ArrayList<Customer> getCustomers()
	{/// Accessor.
		return customers;
	}

	public boolean newCustomer(String customerName, double initialAmount)
	{
		if (findCustomer(customerName) != null)
			return false;

		customers.add(new Customer(customerName, initialAmount));
		return true;
	}

	public boolean addCustomerTransaction(String customerName, double value)
	{
		Customer searchTarget = findCustomer(customerName);

		if (searchTarget == null)
			return false;

		int i = customers.indexOf(searchTarget);
		customers.get(i).addTransaction(value);
		return true;
	}

	private Customer findCustomer(String customerName)
	{
		Customer searchTarget = null;

		for (Customer index : customers)
			if (index.getName().equals(customerName))
				searchTarget = index;

		return searchTarget;
	}
}

class Customer
{
	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name, double initialAmount)
	{/// Constructor.
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public String getName()
	{/// Accessor.
		return name;
	}

	public ArrayList<Double> getTransactions()
	{/// Accessor.
		return transactions;
	}

	public void addTransaction(double value)
	{
		this.transactions.add(value);
	}
}
