public class BabyParrotRunner {
    public static void main(String[] args){
        BabyParrot baby = new BabyParrot("Toucan", 3);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);

    }
}
