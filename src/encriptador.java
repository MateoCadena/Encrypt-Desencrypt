import java.io.*;   //import all the packages for some data for the program
public class Encriptador{   //define the data and the conduct of all the type that this program
  public static void main(String[]args)throws IOException{  //define various methods for start the program
    InputStreamReader isr=new InputStreamReader(System.in); //recognize of the source
    BufferedReader br=new BufferedReader(isr); //allow read a complete line
    BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)); //well as the reader can write a complete line like an enter
    String mensaje=br.readLine();      //create the variable of the message called mensaje
    mensaje=mensaje.toLowerCase();     //change to uppercase to lowercase of the message

    int[]cons=new int[23];             //create variable of the consonants
    for(int w=1; w<22; w++) {            //create a cicle for to the consonants
       cons[w]=w;                       //create in other variable for save the cicle for
    }
    
    for(int g=1; g<23; g++){            //start to encript with for                                    
        cons[g]=cons[g]+1;             //that function is to start to encript
    }
    
    mensaje=mensaje.replace("b","1010");//change characters to integer that can recognize
    mensaje=mensaje.replace("c","1020");
    mensaje=mensaje.replace("d","1030");
    mensaje=mensaje.replace("f","1040");
    mensaje=mensaje.replace("g","1050");
    mensaje=mensaje.replace("h","1060");
    mensaje=mensaje.replace("j","1070");
    mensaje=mensaje.replace("k","1080");
    mensaje=mensaje.replace("l","1090");
    mensaje=mensaje.replace("m","1100");
    mensaje=mensaje.replace("n","1110");
    mensaje=mensaje.replace("ñ","1120");
    mensaje=mensaje.replace("p","1130");
    mensaje=mensaje.replace("q","1140");
    mensaje=mensaje.replace("r","1150");
    mensaje=mensaje.replace("s","1160");
    mensaje=mensaje.replace("t","1170");
    mensaje=mensaje.replace("v","1180");
    mensaje=mensaje.replace("w","1190");
    mensaje=mensaje.replace("x","1200");
    mensaje=mensaje.replace("y","1210");
    mensaje=mensaje.replace("z","1220");
   
    int val=1010;
    String va;
  
    for(int z=1; z<22; z++)             //create other cicle for to the vowels
       {
        if(cons[z]==1 || cons[z]==23 || cons[z]==45 || cons[z]==67 ) // create a cicle if for remplace to character
          {
           va=Integer.toString(val);
           mensaje=mensaje.replace(va,"b");
           val=val+10;
          }
        else
          {
           if(cons[z]==2 || cons[z]==24 || cons[z]==46 || cons[z]==68)
             {
              va=Integer.toString(val);
              mensaje=mensaje.replace(va,"c");
              val=val+10;
             }
           else
             {
              if(cons[z]==3 || cons[z]==25 || cons[z]==47 || cons[z]==69)
                {
                 va=Integer.toString(val);
                 mensaje=mensaje.replace(va,"d");
                 val=val+10;                 
                } 
              else
                {
                 if(cons[z]==4 || cons[z]==26 || cons[z]==48|| cons[z]==70)
                   {
                    va=Integer.toString(val);
                    mensaje=mensaje.replace(va,"f");
                    val=val+10;   
                   }
                 else
                   {
                    if(cons[z]==5 || cons[z]==27 || cons[z]==49 || cons[z]==71)
                      {
                       va=Integer.toString(val);
                       mensaje=mensaje.replace(va,"g");
                       val=val+10;                        
                      }
                    else
                      {
                       if(cons[z]==6 || cons[z]==28 || cons[z]==50 || cons[z]==72)
                         {
                          va=Integer.toString(val);
                          mensaje=mensaje.replace(va,"h");
                          val=val+10;                          
                         }
                       else
                         {
                          if(cons[z]==7 || cons[z]==29 || cons[z]==51 || cons[z]==73) 
                            {
                             va=Integer.toString(val);
                             mensaje=mensaje.replace(va,"j");
                             val=val+10;
                            }
                          else
                            {
                             if(cons[z]==8 || cons[z]==30 || cons[z]==52 || cons[z]==74)
                               {
                                va=Integer.toString(val);
                                mensaje=mensaje.replace(va,"k");
                                val=val+10;
                               }
                             else
                               {
                                if(cons[z]==9 || cons[z]==31 || cons[z]==53 || cons[z]==75)
                                  {
                                   va=Integer.toString(val);
                                   mensaje=mensaje.replace(va,"l");
                                   val=val+10; 
                                  }
                                else
                                  {
                                   if(cons[z]==10 || cons[z]==32 || cons[z]==54 || cons[z]==76)
                                     {
                                      va=Integer.toString(val);
                                      mensaje=mensaje.replace(va,"m");
                                      val=val+10;
                                     }
                                   else
                                     {
                                      if(cons[z]==11 || cons[z]==33 || cons[z]==55 || cons[z]==77) 
                                        {
                                         va=Integer.toString(val);
                                         mensaje=mensaje.replace(va,"n");
                                         val=val+10;
                                        }
                                      else
                                        {
                                         if(cons[z]==12 || cons[z]==34 || cons[z]==56 || cons[z]==78)
                                           {
                                            va=Integer.toString(val);
                                            mensaje=mensaje.replace(va,"ñ");
                                            val=val+10;
                                           }
                                         else
                                           {
                                            if(cons[z]==13 || cons[z]==35 || cons[z]==57 || cons[z]==79)
                                              {
                                               va=Integer.toString(val);
                                               mensaje=mensaje.replace(va,"p");
                                               val=val+10;
                                              }
                                            else
                                              {
                                               if(cons[z]==14 || cons[z]==36 || cons[z]==58 || cons[z]==80)
                                                 {
                                                  va=Integer.toString(val);
                                                  mensaje=mensaje.replace(va,"q");
                                                  val=val+10;
                                                 }
                                               else
                                                 {
                                                  if(cons[z]==15 || cons[z]==37 || cons[z]==59 || cons[z]==81)
                                                    {
                                                     va=Integer.toString(val);
                                                     mensaje=mensaje.replace(va,"r");
                                                     val=val+10;
                                                    }
                                                  else
                                                    {
                                                     if(cons[z]==16 || cons[z]==38 || cons[z]==60 || cons[z]==82)
                                                       {
                                                        va=Integer.toString(val);
                                                        mensaje=mensaje.replace(va,"s");
                                                        val=val+10;
                                                       }
                                                     else
                                                       {
                                                        if(cons[z]==17 || cons[z]==39 || cons[z]==61 || cons[z]==83) 
                                                          {
                                                           va=Integer.toString(val);
                                                           mensaje=mensaje.replace(va,"t");
                                                           val=val+10;
                                                          }
                                                        else
                                                          {
                                                           if(cons[z]==18 || cons[z]==40 || cons[z]==62 || cons[z]==84)
                                                             {
                                                              va=Integer.toString(val);
                                                              mensaje=mensaje.replace(va,"v");
                                                              val=val+10;
                                                             }
                                                           else
                                                             {
                                                              if(cons[z]==19 || cons[z]==41 || cons[z]==63 || cons[z]==85)
                                                                {
                                                                 va=Integer.toString(val);
                                                                 mensaje=mensaje.replace(va,"w");
                                                                 val=val+10;
                                                                }
                                                              else
                                                                {
                                                                 if(cons[z]==20 || cons[z]==42 || cons[z]==64 || cons[z]==86)
                                                                   {
                                                                    va=Integer.toString(val);
                                                                    mensaje=mensaje.replace(va,"x");
                                                                    val=val+10;
                                                                   }
                                                                 else
                                                                   {
                                                                    if(cons[z]==21 || cons[z]==43 || cons[z]==65 || cons[z]==87)
                                                                      {
                                                                       va=Integer.toString(val);
                                                                       mensaje=mensaje.replace(va,"y");
                                                                       val=val+10;
                                                                      }
                                                                    else
                                                                      {
                                                                       if(cons[z]==22 || cons[z]==44 || cons[z]==66 || cons[z]==88)
                                                                         {
                                                                          va=Integer.toString(val);
                                                                          mensaje=mensaje.replace(va,"z");
                                                                          val=val+10;
                                                                         }
                                                                      }
                                                                   } 
                                                                }
                                                             } 
                                                          } 
                                                       } 
                                                    }
                                                 } 
                                              }
                                           } 
                                        }           
                                     }
                                  }
                               } 
                            }
                         } 
                      }  
                   }
                }
             }
          }
       }
                       

    mensaje=mensaje.replace("a","4");  //change the vowels for numbers
    mensaje=mensaje.replace("e","3");
    mensaje=mensaje.replace("i","1");
    mensaje=mensaje.replace("o","0");
    mensaje=mensaje.replace("u","9");
    int[] funcion=new int[5];          //create variable for start the function to numbers  
    funcion[0]=4;
    funcion[1]=3;   
    funcion[2]=1;
    funcion[3]=0;
    funcion[4]=9;     
    String[] fun=new String[5];       
    
    for(int i = 0; i<5; i++)           //with this cicle for start the function   
       {
        funcion[i]=funcion[i]+1;       //this is the function that change the vowels
        fun[i]=Integer.toString(funcion[i]);
       }
    mensaje=mensaje.replace("4",fun[0]);//replace the numbers with the function to can print the message
    mensaje=mensaje.replace("3",fun[1]);
    mensaje=mensaje.replace("1",fun[2]);
    mensaje=mensaje.replace("0",fun[3]);
    mensaje=mensaje.replace("9",fun[4]);
    
    bw.write(mensaje + "\n"); //print the message encript
    bw.flush();    //send all the information
  }
}
