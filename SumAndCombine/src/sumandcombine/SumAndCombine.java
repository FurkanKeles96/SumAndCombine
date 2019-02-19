
package sumandcombine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Furkan Keleş
 * github: https://github.com/FurkanKeles96
 * linkedin: https://www.linkedin.com/in/furkankeles/
 * 
 */
public class SumAndCombine {

    /**
     * Proplem 1'e ait for ve recursive işlemleriyle listedeki sayıların toplamını veren fonksiyonlar
     */
    public static int topla(List<Integer> list){    //For döngüsü ile toplam
        int toplam=0;
        
        for(int sayi:list){
            toplam+=sayi;
        }

        return toplam;
    }
    
    public static int recTopla(ArrayList<Integer> list, int i){     //Recursive toplam. i değeri default 0 olarak da girilebilir.
        
        if(i==list.size()){
            return 0;
        }

        return list.get(i)+recTopla(list, i+1);
    }
    
    
    /**
     * Proplem 2'de belirltilen array'leri birleştirme işlemi. 
     * Problemdeki örnekte bir integer bir string dizisi bileştirildiği için çözüm de ona göre yapıldı.
     * Ancak dizi türleri string'e çevrilebilir.
     */
    public static void combine(ArrayList<Integer> list1, ArrayList<String> list2){ //Liste türleri üzerinde değişiklik yapılabilir.
        ArrayList<String> list = new ArrayList<String>();

        if(list1.size()!=list2.size()){
            System.out.println("Listelerin uzunlukları aynı olmalıdır.");
        }
        else{
            for(int i = 0; i<list1.size(); i++){
                list.add(i, list1.get(i).toString());
         
            }
            for(int j=0; j<list2.size()*2; j+=2){
                list.add(j, list2.get(j/2));
            }
                         
            System.out.println("Combined list...:" + list);
        }
    }
    
    public static void main(String[] args) {
        
        //---------------Problem 1------------------------------
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(2);
        
        int forSonuc = topla(sayilar);  //For döngüsü ile toplama sonucu
        
        int recSonuc = recTopla(sayilar,0);
        
        System.out.println("---------------Problem 1------------------------------\n" );
        System.out.println("FOR LOOP...:" + forSonuc);
        System.out.println("RECURSIVE...:" + recSonuc );
        
        //---------------Problem 1------------------------------
        System.out.println("\n---------------Problem 1------------------------------\n" );
        System.out.println("------------------------------------------------------" );
        System.out.println("\n---------------Problem 2------------------------------\n" );
        //---------------Problem 2------------------------------
        ArrayList<Integer> sayiListesi = new ArrayList<Integer>();  //Birleştirilecek olan sayı listesi
        ArrayList<String> karakterListesi = new ArrayList<String>();    //Birleştirilecek olan karakter listesi
        
        sayiListesi.add(1); //Listeye eklemeler
        sayiListesi.add(2);
        sayiListesi.add(3);
        sayiListesi.add(4);
        sayiListesi.add(5);
        
        karakterListesi.add("a");   //Listeye eklemeler
        karakterListesi.add("b");
        karakterListesi.add("c");
        karakterListesi.add("d");
        karakterListesi.add("e");
        
        combine(sayiListesi, karakterListesi);  //Birleştirme fonksiyonu
        System.out.println("\n---------------Problem 2------------------------------" );
        //---------------Problem 2------------------------------
    }
    
}
