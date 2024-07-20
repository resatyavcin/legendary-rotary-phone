import java.util.Locale;

public class TypeTest {
    /**
     * Programlama dilleri typeless ve typed olarak ayrılır. Typeless dillerde tip veriye ait
     * bir bilgidir. Ve Dynamic diye de isimlendirilir. Bu yüzden variable tipine bakınca hep değişir.
     * Çünkü tip veriye aittir. Böyle diller aynı zamanda derleme zamanında tip analizi yapmazlar.
     * veri çalışma zamanı unsurudur ve tip veriye aittir. Çoğu interpreted dildir.
     *
     * Static typed dillerde (typed) dillerde tip derleme zamanında belirlenir runtime de değişmez.
     *
     *
     * Zorunlu olmamakla birlikte derlenen tipler typed, yorumlanan diller tipsiz olma eğilimindedir.
     * çünkü tip kontrolğ için compile etmek gereklidir.
     *
     * Java strong typed dildir. Çünkü katı kurallara sahiptir ve diğer typed dillere göre daha fazla
     * tip kısıtı ve kuralı vardır. Compile zamanda JVM de type check eder
     *
     *
     * Javada iki tür type vardır.
     * -Primitive (ilkel)
     * -Complex (karmaşık) : Sınıflardan türetildikleri için sınıf(class) tipleri, nesne(object) tipleri,
     * yada nesnelerine referanslarla ulaşıldığı için referans(reference) tipleri de denir.
     *
     * Primitive types: byte, short, int, long, float, double, char, boolean
     * boolean mantıksal(logical - boolean typed), diğerleri sayısaldır(numeric).
     *
     * char dışında sayısalların işaretlidir (signed), pozitif ve negatif değer alabilir.
     * char karakter tipidir ve her karakterin 0 veya pozitif bir tam sayı değeri vardır.
     *
     *
     * (integral types) : integer types(Tamsayılar) -> byte - short - int - long; Characters Type -> char
     * Gerçek Sayılar (Floating - point types): float - double
     * */

    boolean isOpen = true; // 0 ve ya 1 Javada tanımlanamaz.


    /**
     * Unicode karakter seti kullanılır. Karakterlerin sayısal değerleri vardır. 0 yada pozitif değer alabilir.
     * Unicode karakterleri 16 bitliktir. 0 ve 2^16 - 1 değer alırlar.
     */
    char tryedChar = 'a';
   Locale locale = Locale.getDefault();


    /**
     * Self Tyring
     */
    int asciiCharCode = 65;
    int asciiCharCode2 = -12;
    char asciiChar = (char) asciiCharCode;
    char asciiChar2 = (char) asciiCharCode2;



    int a = 3;
    byte v = 0x5a;


    float aF  = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;

    public void getAsciiChar() {
        System.out.println(asciiChar);
        System.out.println(locale);
        System.out.println(asciiChar2); // üzerine 65.536 ekledi üzerine ve öyle bastı. eksi değerde olamaz,
    }



}
