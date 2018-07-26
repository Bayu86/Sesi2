public class Main {
    //psvm
    public static void main(String[] args) {
        //primitive data type,reference data type
        int umur = 29;//Maks : 2M


        Integer umur2 = 12;
        Double cr2 = 2.3;

        Tiger tgr = new Tiger("hitam", 4);
        tgr.lari();

        String wrnaBulu = tgr.getWarnaBulu();
        System.out.println(wrnaBulu);

        Eagle eagle = new Eagle();
        eagle.terbang();
        eagle.makan();
    }
}
