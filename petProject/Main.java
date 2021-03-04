package petProject;

class Main 
{
  public static void main(String[] args) 
  {
	Pet pet1 = new Pet("Jelly", 2, 630, "Panda", "Chinese Panda");
    Pet pet2 = new Pet("Peanut", 3, 35, "Fox", "Arctic Fox");
	Pet pet3 = new Pet("Butter", 6, 30, "Dog", "Bloodhound");
	Pet pet4 = new Pet();
	
	System.out.println(pet1.toString());
	pet1.setWeight(100);
	System.out.println("The new weight is " + pet1.getWeight()+ " pounds.");
	System.out.println("----------");
	
	System.out.println(pet2.toString());
	pet2.setAge(9999);
	System.out.println("The new age is " + pet2.getAge()+ " years old.");
	System.out.println("----------");
	
	System.out.println(pet3.toString());
	pet3.setName("ShirleyTempleBoxSetDVD");
	System.out.println("The new name is " + pet3.getName()+ ".");
	System.out.println("----------");

	System.out.println(pet4.toString());

  }
}