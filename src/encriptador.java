import java.io.*;
public class encriptador{
  public static void main(String[]args)throws IOException{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
    String mensaje=br.readLine();      //mensaje original
    mensaje=mensaje.toLowerCase();     //cambiar mayusculas por minusculas

    int[]cons=new int[23];             //variables para incriptacion de consonantes
    for(int w=1; w<22; w++)
       cons[w]=w;
       
    for(int g=1; g<23; g++)            //incriptador de consonantes                                      
        cons[g]=cons[g]+1;             //¡¡¡¡¡¡¡¡FUNCION!!!!!!! 
   
    mensaje=mensaje.replace("b","1010");//cambiar consonantes por valores numericos unicos para manipulacion
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
  
    for(int z=1; z<22; z++)             //reemplaza consonates 
       {
        if(cons[z]==1 || cons[z]==23 || cons[z]==45 || cons[z]==67 )
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
                       

    mensaje=mensaje.replace("a","4");  //cambiar vocales por numeros
    mensaje=mensaje.replace("e","3");
    mensaje=mensaje.replace("i","1");
    mensaje=mensaje.replace("o","0");
    mensaje=mensaje.replace("u","9");
    int[] funcion=new int[5];          //variables para incriptacion de vocales   
    funcion[0]=4;
    funcion[1]=3;   
    funcion[2]=1;
    funcion[3]=0;
    funcion[4]=9;     
    String[] fun=new String[5];       
    
    for(int i = 0; i<5; i++)           //encriptador de vocales      
       {
        funcion[i]=funcion[i]+1;       //¡¡¡¡¡¡¡¡FUNCION!!!!!!!
        fun[i]=Integer.toString(funcion[i]);
       }
    mensaje=mensaje.replace("4",fun[0]);//reemplazar numeros corregspondientes a numeros incriptados(vocales)
    mensaje=mensaje.replace("3",fun[1]);
    mensaje=mensaje.replace("1",fun[2]);
    mensaje=mensaje.replace("0",fun[3]);
    mensaje=mensaje.replace("9",fun[4]);
    
    bw.write(mensaje + "\n");
    bw.flush();    
  }
}