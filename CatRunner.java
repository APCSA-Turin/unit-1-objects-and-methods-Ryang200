public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Test1", 3, 4.5);   
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Test2", 8, 7.2);  
        cat2.printCatInfo();
        cat2.introduce();
    }
}