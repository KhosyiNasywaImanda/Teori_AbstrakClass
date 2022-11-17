public class Main {
    public static void main(String[] args){

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Makhluk Hidup");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");


        System.out.println("Makhluk hidup adalah organisme yang menjalankan berbagai fungsi kehidupan");
        System.out.println("Makhluk hidup terdiri dari manusia, hewan, dan tumbuhan. Semua makhluk hidup memiliki ciri khas yang membedakannya dengan benda");
        System.out.println("Namun kali ini , disini saya hanya membahasas berkaitan manusia dan Hewan");
        System.out.println("");

        System.out.println("-------- Manusia ------"); 
        Manusia mns = new Manusia();
        mns.bernafas();
        mns.makan();


        System.out.println("-------- Hewan -------");
        Ayam aym = new Ayam();
        aym.bernafas();
        aym.makan();
        aym.berkembangBiak();

        kucing kcg = new kucing();
        kcg.berkembangBiak();

    }
}
