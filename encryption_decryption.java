import java.io.*;
import java.util.Scanner;
class encryption_decryption{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //INTODUCTION TO THE PROGRAM
        System.out.println("A WARM WELCOME TO THE ENCRYPTION AND DECRYPTION SYSTEM!!!");
        System.out.println("-------------------------***------------------------------");
        System.out.println("ENCRYPTION IS THE METHOD BY WHICH PLAINTEXT OR ANY OTHER TYPE OF DATA IS CONVERTED FROM A"); 
        System.out.println("READABLE FORM TO A ENCODED VERSION THAT CAN ONLY BE DECODED BY ANOTHER ENTITY IF THEY HAVE"); 
        System.out.println("ACCESS TO THE DECRYPTION KEY.");
        System.out.println();
        System.out.println("DECRYPTION IS THE PROCESS OF TRANSFORMING DATA THAT HAS BEEN RENDERED UNREADABLE THROUGH");
        System.out.println("ENCRYPTION BACK TO ITS UNENCRYPTED FORM OR THE PLAINTEXT FORM.");
        System.out.println("THIS SYSTEM ENABLES YOU TO ENCRYPT OR DECRYPT YOUR MESSAGE ON THE GIVEN CHOICE IN A VARIOUS TECHNIQUES AS MENTIONED BELOW:");
        System.out.println("1.CAESAR CIPHER");
        System.out.println("2.UNICODE EXCHANGE SYSTEM");
        System.out.println("3.SHIFT CIPHER (CUSTOM)");
        System.out.println("NOW LET'S START ENCRYPTING AND DECRYPTING......:");
        
        //THE MAIN WORKING START HERE
        System.out.println("1.ENCRYPT THE MESSAGE");
        System.out.println("2.DECRYPT THE MESSAGE");
        System.out.println("ENTER THE CHOICE(1-2):");
        int c=Integer.parseInt(br.readLine());
        int c1=0;
        char ch=' ';
        int num=0, len=0; 
        String st="";
        
        switch(c){
            
            //ENCRYPTION SEGMENT
            case 1:
             System.out.println("1.CAESAR CIPHER");
             System.out.println("2.UNICODE EXCHANGE SYSTEM");
             System.out.println("3.SHIFT CIPHER (CUSTOM)");
             System.out.println("ENTER THE CHOICE(1-3):");
             c1=Integer.parseInt(br.readLine());
             System.out.println("ENTER THE MESSAGE TO BE ENCRYPTED:");
             String st1=br.readLine();
             
             switch(c1){
                 
                 //CAESAR CIPHER
                 case 1:
                 len=st1.length();
                 for(int i=0; i<len; i++){
                     ch=st1.charAt(i);
                     num=ch+3;
                     if(num>127)
                     num=num-127;
                     ch=(char)num;
                     st=st+ch;
                    }
                 System.out.println("YOUR ENCRYPTED CODE USING CAESAR CIPHER IS:"+st);
                 break;
                 
                 //UNICODE EXCHANGE SYSTEM
                 case 2:
                 int k=0, org=0; 
                 String st3="";
                 len=st1.length();
                 for(int i=0; i<len; i++){
                     ch=st1.charAt(i);
                     num=ch;
                     org=num;
                     while(num>0){
                         k++;
                         num=num/10;
                        }
                     if(k==1)
                     st3="00"+Integer.toString(org);
                     else if(k==2)
                     st3="0"+Integer.toString(org);
                     else if(k==3)
                     st3=Integer.toString(org);
                     st=st+st3;
                     
                     k=0;
                    }
                 System.out.println("YOUR ENCRYPTED CODE USING UNICODE EXCHANGE SYSTEM IS:"+st);
                 break;
                 
                 //SHIFT CIPHER
                 case 3:
                 System.out.println("ENTER THE CUSTOM CHARACTER SHIFT FOR ENCRYPTION:");
                 int s=Integer.parseInt(br.readLine());
                 len=st1.length();
                 for(int i=0; i<len; i++){
                     ch=st1.charAt(i);
                     num=ch+s;
                     if(num>127)
                     num=num-127;
                     ch=(char)num;
                     st=st+ch;
                    }
                 System.out.println("YOUR ENCRYPTED CODE USING CUSTOM SHIFT CIPHER IS:"+st);
                 break;
                 
                 
                 default:
                 System.out.println("YOUR CHOICE IS WRONG. PLEASE TRY AGAIN.");
                }
                break;
             
             //DECRYPTION SEGMENT   
             case 2:
             System.out.println("1.CAESAR CIPHER");
             System.out.println("2.UNICODE EXCHANGE SYSTEM");
             System.out.println("3.SHIFT CIPHER (CUSTOM)");
             System.out.println("ENTER THE CHOICE(1-3):");
             c1=Integer.parseInt(br.readLine());
             System.out.println("ENTER THE MESSAGE TO BE DECRYPTED:");
             String st2=br.readLine();
             
             switch(c1){
                 
                 //CAESAR CIPHER
                 case 1:
                 len=st2.length();
                 for(int i=0; i<len; i++){
                     ch=st2.charAt(i);
                     num=ch-3;
                     if(num<0)
                     num=num+127;
                     ch=(char)num;
                     st=st+ch;
                    }
                System.out.println("YOUR DECRYPTED CODE USING CAESAR CIPHER IS:"+st);
                break;
             
                 //UNICODE EXCHANGE SYSTEM
                 case 2:
                 int h=3;
                 len=st2.length();
                 for(int i=0; i<len; i=i+3){
                 num=Integer.parseInt(st2.substring(i,h));
                 ch=(char)num;
                 st=st+ch;
                 h=h+3;
                }
                System.out.println("YOUR DECRYPTED CODE USING UNICODE EXCHANGE SYSTEM IS:"+st);
                break; 
                
                //SHIFT CIPHER
                 case 3:
                 System.out.println("ENTER THE CUSTOM CHARACTER SHIFT FOR ENCRYPTION:");
                 int s=Integer.parseInt(br.readLine());
                 len=st2.length();
                 for(int i=0; i<len; i++){
                     ch=st2.charAt(i);
                     num=ch-s;
                     if(num<0)
                     num=num+127;
                     ch=(char)num;
                     st=st+ch;
                    }
                 System.out.println("YOUR DECRYPTED CODE USING CUSTOM SHIFT CIPHER IS:"+st);
                 break;
                 
                 
                 default:
                 System.out.println("YOUR CHOICE IS WRONG. PLEASE TRY AGAIN.");
                }
                break;
              
               default:
               System.out.println("YOUR CHOICE IS WRONG. PLEASE TRY AGAIN.");
            }}}
                 
                     
                     
             
             
             
                 
                 
                 
                 
                     
                      
                        
                     
                 
                 
                 
                 
                 
                 
                 
        
        
        
        
        
        