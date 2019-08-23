
import static java.lang.Integer.max;
import static java.lang.System.exit;
import java.util.*;
import java.math.*;

public class Live {
    int score=0;
    String b1,b2;
    int run;
    int score1=0,score2=0;
    String strike=b1;
    
    
    void one(){
   if(run==1)
   {
       if(strike==b1)
       {
       score1=score1+1;
       score=score+1;
       strike=b2;
       }
       else
       {
        score2=score2+1;
        score=score+1;
        strike=b1;   
       }
   }
    
    }
     void two(){
   if(run==2)
   {
       if(strike==b1)
       {
       score1=score1+2;
       score=score+2;
       strike=b1;
       }
       else
       {
        score2=score2+2;
        score=score+2;
        strike=b2;   
       }
   }
    
    }
        void three(){
   if(run==3)
   {
       if(strike==b1)
       {
       score1=score1+3;
       score=score+3;
       strike=b2;
       }
       else
       {
        score2=score2+3;
        score=score+3;
        strike=b1;   
       }
   }
    
    }
           void four(){
   if(run==4)
   {
       if(strike==b1)
       {
       score1=score1+4;
       score=score+4;
       strike=b1;
       }
       else
       {
        score2=score2+4;
        score=score+4;
        strike=b2;   
       }
   }
    
    }
              void five(){
   if(run==5)
   {
       if(strike==b1)
       {
       score1=score1+0;
       score=score+5;
       strike=b1;
       }
       else
       {
        score2=score2+0;
        score=score+5;
        strike=b2;   
       }
   }
    
    }
                 void six(){
   if(run==6)
   {
       if(strike==b1)
       {
       score1=score1+6;
       score=score+6;
       strike=b1;
       }
       else
       {
        score2=score2+6;
        score=score+6;
        strike=b2;   
       }
   }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score=0;
        int over;
        int wicket=0;
        
        int run = 0;
        String outwic[]=new String[11];
        String b1 = null,b2=null,b3=null;
        String strike=null;
        String strike1=b3;
        int score1=0,score2=0;
        
        Live l=new Live();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the batsman name");
        b1=s.next();
        System.out.println("enter the other batsman name");
        b2=s.next();
        System.out.println("Batsmen on the crease are "+b1 + " and " + b2);
        System.out.println(b2+" is on strike");
        boolean b=true;
        for(int j=1;j<=20;j++){
        for(int i=1;i<=6;i++)
        {
        System.out.println("enter the run on the "+i+" ball");
        run=s.nextInt();
        
     
        if(run==0)
        {
            System.out.print("Is that out?");
            int out=s.nextInt();
            if(out==1)
            {
                wicket++;
               
               // System.out.println("enter the batsman on strike");
              //  strike=s.next();
                outwic[i]=strike;
                if(strike==b1)
                {
                    if(wicket<10){
                System.out.println("enter the new batsman");
                b3=s.next();
                b1=b3;
                score1=0;}
                }
                else
                {
                    if(wicket<10){
                    System.out.println("enter the new batsman");
                    b3=s.next();
                    b2=b3;  
                    score2=0;}
                }
            }
            else{
                score=score+0;
                score1=score1+0;
                score2=score2+0;
            }
        }
        
         if(run==1)
    {
       if(strike==b1)
       {
       score1=score1+1;
       score=score+1;
       strike=b2;
       }
       else
       {
        score2=score2+1;
        score=score+1;
        strike=b1;   
       }
   }
          if(run==2)
   {
       if(strike==b1)
       {
       score1=score1+2;
       score=score+2;
       strike=b1;
       }
       else
       {
        score2=score2+2;
        score=score+2;
        strike=b2;   
       }
   }
           if(run==3)
   {
       if(strike==b1)
       {
       score1=score1+3;
       score=score+3;
       strike=b2;
       }
       else
       {
        score2=score2+3;
        score=score+3;
        strike=b1;   
       }
   }
            if(run==4)
   {
       if(strike==b1)
       {
       score1=score1+4;
       score=score+4;
       strike=b1;
       }
       else
       {
        score2=score2+4;
        score=score+4;
        strike=b2;   
       }
   }
     if(run==5)
   {
       if(strike==b1)
       {
       score1=score1+0;
       score=score+5;
       strike=b1;
       }
       else
       {
        score2=score2+0;
        score=score+5;
        strike=b2;   
       }
   }
      if(run==6)
   {
       if(strike==b1)
       {
       score1=score1+6;
       score=score+6;
       strike=b1;
       }
       else
       {
        score2=score2+6;
        score=score+6;
        strike=b2;   
       }
   }
    
       /*  while(b)
        {
            System.out.println("Press\t 1.1run\t 2.2runs\t 3.3runs\t 4.4runs\t 5.5runs\t 6.6runs\t 7.exit");
            int ch=s.nextInt();
           switch(ch)
            {
                case 1:l.one();
                break;
                case 2:l.two();
                break;
                case 3:l.three();
                break;
                case 4:l.four();
                break;
                case 5:l.five();
                break;
                case 6:l.six();
                break;
                case 7:b=false;
                break;
            }*/
            System.out.println("Current score is ->" +score+"/"+wicket);
            // System.out.println("Out batsmen"+outwic[i]);
            System.out.println(b1+"\t"+score1);
            System.out.println(b2+"\t"+score2);
           
             if(wicket==10)
                {
                    System.out.println("All Out!!!!End of Innings");
                   
                    System.out.println("Target For Team is ->"+(score+1));
                     exit(0);
                }
            
        }
           
       for(int i=6;i==6;i++){
           if(strike==b1)
        {//if(strike==b1)
            
            if(run==1 || run==3 )
            {
               
                strike=b1;
            }
            else
            {
                
                strike=b2;
            }
          
      /* if(i==1 && strike==b2)
            if(run==1 || run==3 )
            {
                score2++;
                strike=b2;
            }
            else
            {
                
                strike=b1;
            }*/
       }}
            System.out.println("End of "+j+" over");
             System.out.println("Current Runrate is:"+(float)(score)/j);
            if(j==20)
        {
             System.out.println("End of innings!!!!!");
             System.out.println("Target For Team is"+(score+1));
             exit(0);
             
        }
        }
    }
    
}
