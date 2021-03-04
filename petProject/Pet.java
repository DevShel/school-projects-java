package petProject;

public class Pet
{
		public String name;
		public int age;
		public int weight;
		public String type;
		public String breed;

	public Pet(String initName, int initAge, int initWeight, String initType, String initBreed)
	{
		name = initName;
		age = initAge;
		weight = initWeight;
		type = initType;
		breed = initBreed;

	}

	public Pet()
	{
		name = "Richard";
		age = 7;
		weight = 13;
		type = "Cat";
		breed = "Sphinx";
	}	


	public int setWeight(int newWeight)
	{
		return weight = newWeight;
	}
	
	public int getWeight()
	{
		return weight;
	}

	public int setAge(int newAge)
	{
		return age = newAge;
	}
	
	public int getAge()
	{
		return age;
	}

	public String setName(String newName)
	{
		return name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	

	public String toString()
	{
		return "Name: " + name + " Age: " + age + " Weight: " + weight + " Type: " + type + " Breed: " + breed;
	}


	//instance variables : name, age, weight, animalType, breed
	// 2 constructors :
	// one with all instance variables initialized 
	// one with no parameters provided (default values?)

	//accessor (get) methods for each of the instance variables (5 methods)
	//Mutator (set) methods for each of the instance variables (5 methods)
	//toString() return all of the information (return an entire pet record)
	

}
