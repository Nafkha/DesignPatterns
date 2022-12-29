package Singleton.SimpleSingleton;

public class MonSingleton {
    private static MonSingleton instance = null;

    int id;
    private MonSingleton(int id){
        this.id = id;

    }

    public static MonSingleton getInstance(){
        if(instance == null){
            instance = new MonSingleton(1);
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
