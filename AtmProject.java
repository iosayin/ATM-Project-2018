public class ATMProjesi {

    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 1000;
        
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                          + "2.İşlem : Para Çekme\n"
                          + "3.İşlem : Para Yatırma\n"
                          + "Çıkış için q'a basın";
        
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while(true){
        
        
        System.out.print("İşlemi Seçiniz:");
        String islem = scanner.nextLine();
        
        if(islem.equals("q")){
            
            System.out.println("Çıkış işlemi başarılı");
            break; 
        }
        else if(islem.equals("1")){
            
            System.out.println("Bakiyeniz :" + bakiye);
            
        }
        else if(islem.equals("2")){
            
            System.out.print("Çekmek istediğiniz tutar:");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            
           if(bakiye - tutar < 0){
               
            System.out.println("Bakiye yetersiz. Mevcuz bakiyeniz =" + bakiye);
            
           }
           else{
               
           bakiye -= tutar;
               System.out.println("Yeni bakiyeniz =" + bakiye);
        }
        }
        
          else if (islem.equals("3")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                System.out.println("Yeni Bakiyeniz  : " + bakiye);
                
        }
        else{
            System.out.println("Hatalı işlem yaptınız.");
            
            
        }
        
        }  
       
        
    
        
        
       
    }
    
}
