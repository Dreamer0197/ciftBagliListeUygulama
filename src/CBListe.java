
public class CBListe {
        private Dugum ilk;
        public CBListe(){
    
            this.ilk=null;
        
        }
       public void basaEkle(int deger){
         
        Dugum yeni=new Dugum(deger);
        if(this.ilk==null){
            
            this.ilk=yeni;
            return;
        
        }
        this.ilk.setOnceki(yeni);
        yeni.setSonraki(this.ilk);
        this.ilk=yeni;
    
       }
    
    
       public void sonaEkle(int deger){
    
        Dugum yeni=new Dugum(deger);
        if(this.ilk==null){
            
            this.ilk=yeni;
            return;
        
        }
        Dugum temp=this.ilk;
        while(temp.getSonraki()!=null){
    
            temp=temp.getSonraki();
    
        }
        temp.setSonraki(yeni);
        yeni.setOnceki(temp);
    
       }
    
       public void arayaEkle(int deger,int indis){
    
        if((this.ilk==null)||(indis==1)){
            this.basaEkle(deger);
            return;
        }
        Dugum yeni=new Dugum(deger);
        Dugum temp=this.ilk;
        int sayac=1;
        while(temp.getSonraki()!=null){
           if(sayac+1==indis){
            break;
           }
           sayac++;
           temp=temp.getSonraki();
        }
        temp.getSonraki().setOnceki(yeni);
        yeni.setSonraki(temp.getSonraki());
        temp.setSonraki(yeni);
        yeni.setOnceki(temp);
    
    }
       public void listele(){
    
        Dugum temp=this.ilk;
        if(temp==null){
          System.out.println("Liste boş");
          return;
        }
        while (temp!=null){
            temp.yazdir();
            //temp=temp.sonraki;
            temp=temp.getSonraki();
    
        }
    }
    
    }

