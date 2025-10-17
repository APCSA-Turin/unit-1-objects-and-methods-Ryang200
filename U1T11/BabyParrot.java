public class BabyParrot {
  private String species;
  private int age;
  private String name;

  public BabyParrot(String species, int age) {
    this.species = species;
    this.age = age;
    this.name = ""; // use a default value of the 'empty string'
  }

  public void setName(String newName) {
    name = newName;
  }
  
  // note this method RETURNS a String
  public String parrotInfo() {
    String str = "Species: " + species + "\n";
    str += "Name: " + name + "\n";
    str += "Age: " + age;
    return str;
  }
}
