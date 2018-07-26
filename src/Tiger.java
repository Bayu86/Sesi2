public class Tiger extends Animal {
    String warnaBulu;
    int jmlKaki;

    //construktor
    Tiger(String warnaBulu){
        System.out.println("ini konstruktor dr kelas Tiger");
        this.warnaBulu = warnaBulu;
        super.warnaBulu = warnaBulu;
    }

    //overload
    Tiger(String warnaBulu, int jmlKaki){
        this(warnaBulu);
        System.out.println("overload....");
    }

    void makan(String makanan){
    }

    void lari(){
        System.out.println("Lari...");
    }

    void makan(){
        System.out.println("makan....");
    }
    String getWarnaBulu(){
        warnaBulu="orange";
        return warnaBulu;
    }
}
