/**
 * -> Sadece 'new' keywordü ile sadece nesne oluştururken çağırılırlar. Kurucu çağrısı yapmadan
 * nesnesi oluştururlabilen çok az tip vardır. Bunlar String, dizi(array), basit tiplerin
 * nesne halleri (wrappers) vs.
 * -> Upper Case isimlendirirler ve bulunduğu class ismi ile aynı isimde olmak zorundadırlar.
 * -> Dönüş tipi ve değeri yoktur. Aynı isimde dönüş tipi yazarsanız derleyici hata vermez ama o metot
 * kurucu(constructor) metot değildir.
 * -> İçeride metot çağrısı olabilir.
 * -> Overload edilebilirler. Bu durum farklı nesne şekillerini oluşturmaya olanak sağlar.
 * Çünkü farklı parametreler ile çağırılan constructorların normal bir sonucudur.
 * -> Overload edilmiş constructorlar birbirini de çağırabilirler. Void kelimesi kullanılamaz,
 * return cümlesi yazılamaz, uyazılacaksa 'return;' olarak yazılmalıdır.
 * -> Üye metot(member metot) değildirler. Miras gibi bazı şeyler kurucu metotlar için geçerli değildir.
 * -> Arg almayan kuruculara default, no-arg, dummy constructor; alanlara ise argument yada
 * smart constructor denir. Yazılmasa da compiler kendisi default olarak oluşturur. Bu derleyici
 * tarafından oluşturulan default constructor parametre almaz ve değer ataması yapmaz. Bizim
 * smart constructor oluşturduğumuz durumda compiler default constructor sağlamaz.
 */


public class TestConstructor {

    String value1;
    float value2;



    public TestConstructor(){
        // Burada değer ataması olan bir constructor yazmak tek düzelik getirir.

        System.out.println("TestConstructor running...");

        value1 = "Hello";
        value2 = 20.0f;
        return;
    }

    public TestConstructor(String value1, float value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public void printValue(){
        System.out.println(value1);
        System.out.println(value2);
    }


}
