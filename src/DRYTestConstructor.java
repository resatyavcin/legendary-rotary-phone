/**
 * this, içinde bulunulan nesneyi temsil eder ve kurucu çağrısı this() ieklinde olur.
 * this() çağrısı, kurucularda çağırılır ve kurucular çağırılır. Kendisini çağıramaz yani recursive() olamaz.
 * this() çağrısı, constructor içerisindeli ilk satır olmalı.
 * this() olmayan kurucularda nesne tamamlanması olmadan iş yapılmamalıdır. Aksi takdirde beklenmedik sonuçlar verir.
 * this() birden fazla kurucu içinde çağrılamaz.
 * this referansına atama yapılamaz.
 *
 * */


public class DRYTestConstructor {

    String type;
    float height;

    DRYTestConstructor(String type, float height){
        this.type = type;
        this.height = height;
    }

    DRYTestConstructor(String newType){
        this(newType, 10.0f);
    }

    DRYTestConstructor(float newHeight){
        this("Pine", newHeight);
    }

    DRYTestConstructor(){
        this("Pine", 12.3f);
    }


    public DRYTestConstructor copy(){
        DRYTestConstructor copy = new DRYTestConstructor(type, height);
        return copy;
    }

    public DRYTestConstructor grow(){
        height++;
        return this;
    }



    public void printValue(){
        int height = 0;
        System.out.println("------printValue-------");
        System.out.println(type);
        System.out.println(this.height);
        //System.out.println(height + "+" + height);
    }


}
