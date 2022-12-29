package Singleton.SimpleSingleton;

public class main {
    public static void main(String[] args) {
        MonSingleton s1 = MonSingleton.getInstance();

        MonSingleton s2 = MonSingleton.getInstance();

        System.out.println(s1.getId());
        System.out.println(s2.getId());
        s1.setId(2);
        System.out.println(s1.getId());
        System.out.println(s2.getId());

    }
}
